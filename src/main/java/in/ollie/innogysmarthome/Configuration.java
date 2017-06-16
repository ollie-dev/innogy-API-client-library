package in.ollie.innogysmarthome;

import org.apache.commons.lang3.StringUtils;

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
    private String redirectUrl = null;

    /**
     * Creates a new {@link Configuration} and set the given clientId, clientSecret, redirectUrl and refreshToken.
     *
     * @param clientId
     * @param clientSecret
     * @param redirectUrl
     * @param refreshToken
     */
    public Configuration(String clientId, String clientSecret, String redirectUrl, String refreshToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUrl = redirectUrl;
        this.refreshToken = refreshToken;
    }

    /**
     * Creates a new {@link Configuration} and set the given clientId, clientSecret, redirectUrl, authCode, accessToken
     * and refreshToken.
     *
     * @param clientId
     * @param clientSecret
     * @param redirectUrl
     * @param authCode
     * @param accessToken
     * @param refreshToken
     */
    public Configuration(String clientId, String clientSecret, String redirectUrl, String authCode, String accessToken,
            String refreshToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUrl = redirectUrl;
        this.authCode = authCode;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    /**
     * Creates an empty {@link Configuration}.
     */
    public Configuration() {
    }

    /**
     * Checks, if the {@link Configuration} is complete and all relevant properties for a successful
     * communication with the innogy SmartHome service are set.
     *
     * @return true, if the {@link Configuration} is valid
     */
    public boolean check() {
        if (!checkClientData()) {
            return false;
        }
        if (StringUtils.isEmpty(authCode)) {
            return checkRefreshToken();
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
        if (StringUtils.isEmpty(clientId) || StringUtils.isEmpty(clientSecret) || StringUtils.isEmpty(redirectUrl)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checks, if the {@link Configuration} includes the refresh token.
     *
     * @return
     */
    public boolean checkRefreshToken() {
        if (StringUtils.isEmpty(refreshToken)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checks, if the {@link Configuration} includes the access token.
     *
     * @return
     */
    public boolean checkAccessToken() {
        if (StringUtils.isEmpty(accessToken)) {
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

    /**
     * @return the redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * @param redirectUrl the redirectUrl
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    @Override
    public String toString() {
        String simplifiedAccessToken = "";
        String simplifiedRefreshToken = "";

        if (!StringUtils.isEmpty(accessToken)) {
            simplifiedAccessToken = accessToken.substring(0, 10) + "..."
                    + accessToken.substring(accessToken.length() - 10);
        }
        if (!StringUtils.isEmpty(refreshToken)) {
            simplifiedRefreshToken = refreshToken.substring(0, 5) + "..."
                    + refreshToken.substring(refreshToken.length() - 5);
        }

        return "Config [clientId=" + clientId + ", clientSecret=" + clientSecret + ", redirectUrl=" + redirectUrl
                + ", authCode=" + authCode + ", accessToken=" + simplifiedAccessToken + ", refreshToken="
                + simplifiedRefreshToken + "]";
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
        return "Config [clientId=" + clientId + ", clientSecret=" + clientSecret + ", redirectUrl=" + redirectUrl
                + ", authCode=" + authCode + ", accessToken=" + accessToken + ", refreshToken=" + refreshToken + "]";
    }

}
