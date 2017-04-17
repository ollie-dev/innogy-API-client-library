package in.ollie.innogysmarthome;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class Util {

    public static DateTime convertZuluTimeStringToDate(String timeString) {
        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
        return fmt.parseDateTime(timeString);
    }

    /**
     * Compares two strings, but returns null, if one of the strings is null.
     *
     * @param string1
     * @param string2
     * @return
     */
    public static Boolean equalsIfPresent(String string1, String string2) {
        if (string1 == null || string2 == null) {
            return null;
        } else if (string2.equals(string1)) {
            return true;
        } else {
            return false;
        }
    }
}
