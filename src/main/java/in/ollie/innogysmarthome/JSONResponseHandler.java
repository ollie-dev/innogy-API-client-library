package in.ollie.innogysmarthome;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.api.client.http.HttpResponse;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class JSONResponseHandler {
    private static final Logger logger = LoggerFactory.getLogger(JSONResponseHandler.class);

    /**
     * Returns the {@link JsonObject} from the given JSON response {@link String} or null if the json
     * response was empty or could not be parsed.
     *
     * @param httpResponse
     * @return jsonObject
     */
    public static JsonElement toJsonElement(HttpResponse httpResponse) {
        String jsonResponse = null;
        try {
            jsonResponse = IOUtils.toString(httpResponse.getContent());
            if (jsonResponse != null && !jsonResponse.trim().equals("")) {
                return new JsonParser().parse(jsonResponse);
            }
        } catch (IOException e) {
        } catch (JsonParseException e) {
            logger.error("An JsonParseException occurred by parsing jsonRequest: " + jsonResponse, e);
        }

        return null;
    }

    public static JsonArray toJsonArray(HttpResponse httpResponse) {
        JsonElement element = toJsonElement(httpResponse);
        if (element.isJsonArray()) {
            return (JsonArray) element;
        } else {
            return null;
        }
    }

    public static JsonObject toJsonObject(HttpResponse httpResponse) {
        JsonElement element = toJsonElement(httpResponse);
        if (element.isJsonObject()) {
            return (JsonObject) element;
        } else {
            return null;
        }
    }

    /**
     * Checks the JSON response and returns true if it was successful, otherwise false.
     *
     * @param jsonResponse
     * @return true, if successful
     */
    public static boolean checkResponse(JsonElement jsonResponse) {
        if (jsonResponse == null) {
            return false;
        } else {
            return true;
        }
    }
}
