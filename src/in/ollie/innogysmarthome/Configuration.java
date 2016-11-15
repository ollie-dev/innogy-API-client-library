package in.ollie.innogysmarthome;

/**
 * The {@link Configuration} contains all configurations for the innogy SmartHome library.
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
public class Configuration {
    private String authCode = null;
    private String accessToken = null;
    private String refreshToken = null;
    private String clientId = null;
    private String clientSecret = null;

    /**
     * Creates a new {@link Configuration} and set the given clientId, clientSecret, authCode, accessToken and
     * refreshToken. The
     * other configurations will be set to default.
     *
     * @param clientId
     * @param clientSecret
     * @param authCode
     * @param accessToken
     * @param refreshToken
     */
    public Configuration(String clientId, String clientSecret, String authCode, String accessToken,
            String refreshToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.authCode = authCode;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    /**
     * Creates a {@link Configuration} with default values.
     */
    public Configuration() {
        // config with default values
    }

    /**
     * Checks, if the {@link Configuration} is complete and all relevant properties for a successful
     * communication with the innogy SmartHome service are set.
     *
     * @return
     */
    public boolean check() {
        if (!checkClientData()) {
            return false;
        }
        if (authCode == null || "".equals(authCode)) {
            return checkTokens();
        } else {
            return true;
        }
    }

    /**
     * Checks, if the {@link Configuration} has the necessary {@link #clientId} and {@link #clientSecret} set.
     *
     * @return true if everything seems fine or false, if one of those are missing.
     */
    public boolean checkClientData() {
        if (clientId == null || "".equals(clientId) || clientSecret == null || "".equals(clientSecret)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checks, if the {@link Configuration} includes the access tokens.
     *
     * @return
     */
    public boolean checkTokens() {
        if (accessToken == null || "".equals(accessToken) || refreshToken == null || "".equals(refreshToken)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checks, if the authCode is set.
     *
     * @return
     */
    public boolean checkAuthCode() {
        return !org.apache.commons.lang3.StringUtils.isBlank(authCode);
    }

    /**
     * @return the authCode
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * @param authCode the authCode to set
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * @return the accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken the accessToken to set
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * @return the refreshToken
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * @param refreshToken the refreshToken to set
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * @return the clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * @return the clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * @param clientSecret the clientSecret to set
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Override
    public String toString() {
        String simplifiedAccessToken = accessToken.substring(0, 10) + "..."
                + accessToken.substring(accessToken.length() - 10);
        String simplifiedRefreshToken = refreshToken.substring(0, 5) + "..."
                + refreshToken.substring(refreshToken.length() - 5);

        return "Config [clientId=" + clientId + ", clientSecret=" + clientSecret + ", authCode=" + authCode
                + ", accessToken=" + simplifiedAccessToken + ", refreshToken=" + simplifiedRefreshToken + "]";
    }

    /**
     * Returns a string representation of the object like {@link Configuration#toString()}, but including all secrets.
     * If you are unsure, simply use {@link Configuration#toString()} instead.
     *
     * WARNING: the returned string includes all secret tokens. With a token, the full access to the innogy webservice
     * for the user concerned. NEVER make them publicly available!
     *
     * @return
     */
    public String toStringWithSecrets() {
        return "Config [clientId=" + clientId + ", clientSecret=" + clientSecret + ", authCode=" + authCode
                + ", accessToken=" + accessToken + ", refreshToken=" + refreshToken + "]";
    }

}
