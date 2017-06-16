import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import in.ollie.innogysmarthome.Configuration;

public class ConfigurationTest {

    private final static String CLIENT_ID = "24635748";
    private final static String CLIENT_SECRET = "no secret";
    private final static String REDIRECT_URL = " https://www.ollie.in/innogy-smarthome-token/";
    private final static String REFRESH_TOKEN = "1234567890abcdef";
    private final static String AUTH_CODE = "1234567890abcdef";
    private final static String ACCESS_TOKEN = "eyJ0eXAiOiJzI1NiIsIng1dCI6IkxQajZ1bjFQMFh6blNuYnZXSXgKV1QiLCJhbGciOiJSUxTHJFemJmUSJ9.eyJjbGllbnRfaWQiO6Im9rdWhsLWRldiIsImRldmljZSI6IjkxNDEwMDAiIyNDYzNTc0OCIsInN1YiIwNzk5NiIsImNsaWVmFudCI6IlJXRSIsInVzZXJfcGVybWlzc2lvbnMiOiJGRkudF9wZXJtaXNzaW9ucyI6IkRGRiIsInRlbZGRkZGRkZGRkZGRkZGIiwic2Vzc2lvbiI6ImM2MzQ1NmExOWUxYTQ5ZGFhNzhjNWIyMWFkN2EzOWFkIiwiaXNzIjoiU21hcnRIb21lQVBJIiwiYXVkIjoiYWxsIiwiZXhwIjoxNDkzMzE3NTQ1LCJuYmYiOjE0OTMxNDQ3NDV9.qpihZZgtpyyvpM-rpoQKG-1_Tvox07hJbKxhbORubiILzcmfcXppX5FFWLN1_3Bshr0WYQYndYguyiD1LYqbRjyT1mWvBmIwrbcbBy1b8HwTxJBdb2l4dEaLckYkM4SE6LQfcJc35Ybxxsr43cPmcKnoP1LfV3iRwaXunAD_4Zrlp_rwhl6jLpkzZAHnurxrU2AKTYF-Rx73ThCcd4zr5wh9NQ3x4cmr3sAGG4jCkHzCqxOXyoSuh5Y59fdXaDVSL2iOtSu6ZMxPoFmBoX6rNjXdtWWHSsRrHLkqDENb6Gcexx4Qrp__DkCUoeLvLDdn13Tjb5rxEfSDNWwd0CeYTQ";

    @Before
    public void setUp() {
    }

    @Test
    public void testConstructors() {
        Configuration config = new Configuration(CLIENT_ID, CLIENT_SECRET, REDIRECT_URL, REFRESH_TOKEN);
        assertEquals(CLIENT_ID, config.getClientId());
        assertEquals(CLIENT_SECRET, config.getClientSecret());
        assertEquals(REDIRECT_URL, config.getRedirectUrl());
        assertEquals(REFRESH_TOKEN, config.getRefreshToken());

        config = new Configuration(CLIENT_ID, CLIENT_SECRET, REDIRECT_URL, AUTH_CODE, ACCESS_TOKEN, REFRESH_TOKEN);
        assertEquals(CLIENT_ID, config.getClientId());
        assertEquals(CLIENT_SECRET, config.getClientSecret());
        assertEquals(REDIRECT_URL, config.getRedirectUrl());
        assertEquals(REFRESH_TOKEN, config.getRefreshToken());
        assertEquals(AUTH_CODE, config.getAuthCode());
        assertEquals(ACCESS_TOKEN, config.getAccessToken());

    }

    @Test
    public void testCheck() {
        // with auth code
        assertTrue(new Configuration(CLIENT_ID, CLIENT_SECRET, REDIRECT_URL, AUTH_CODE, null, null).check());

        // with refresh token
        assertTrue(new Configuration(CLIENT_ID, CLIENT_SECRET, REDIRECT_URL, REFRESH_TOKEN).check());

        // with access and refresh tokens
        assertTrue(
                new Configuration(CLIENT_ID, CLIENT_SECRET, REDIRECT_URL, null, ACCESS_TOKEN, REFRESH_TOKEN).check());

        // invalid configurations
        assertFalse(
                new Configuration(null, CLIENT_SECRET, REDIRECT_URL, AUTH_CODE, ACCESS_TOKEN, REFRESH_TOKEN).check());
        assertFalse(new Configuration(CLIENT_ID, null, REDIRECT_URL, AUTH_CODE, ACCESS_TOKEN, REFRESH_TOKEN).check());
        assertFalse(new Configuration(CLIENT_ID, CLIENT_SECRET, null, AUTH_CODE, ACCESS_TOKEN, REFRESH_TOKEN).check());
        assertFalse(new Configuration(CLIENT_ID, CLIENT_SECRET, REDIRECT_URL, null, ACCESS_TOKEN, null).check());
    }

    @Test
    public void testCheckClientData() {
        assertTrue(new Configuration(CLIENT_ID, CLIENT_SECRET, REDIRECT_URL, null).checkClientData());
        assertFalse(new Configuration(null, CLIENT_SECRET, REDIRECT_URL, null).checkClientData());
        assertFalse(new Configuration(CLIENT_ID, null, REDIRECT_URL, null).checkClientData());
        assertFalse(new Configuration(CLIENT_ID, CLIENT_SECRET, null, null).checkClientData());

    }
}
