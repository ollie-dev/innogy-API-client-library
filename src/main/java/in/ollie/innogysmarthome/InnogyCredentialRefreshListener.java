package in.ollie.innogysmarthome;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.auth.oauth2.TokenErrorResponse;
import com.google.api.client.auth.oauth2.TokenResponse;

public class InnogyCredentialRefreshListener implements CredentialRefreshListener {

    private Logger logger = LoggerFactory.getLogger(InnogyCredentialRefreshListener.class);
    private Configuration config;

    public InnogyCredentialRefreshListener(Configuration config) {
        this.config = config;
    }

    @Override
    public void onTokenResponse(Credential credential, TokenResponse tokenResponse) throws IOException {
        config.setAccessToken(credential.getAccessToken());
        logger.debug("innogy access token saved (onTokenResponse): {}", credential.getAccessToken());
    }

    @Override
    public void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenErrorResponse) throws IOException {
        config.setAccessToken(credential.getAccessToken());
        logger.debug("innogy access token saved (onTokenErrorResponse): {}", credential.getAccessToken());
    }

}
