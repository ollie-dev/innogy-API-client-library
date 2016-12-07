package in.ollie.innogysmarthome;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class Util {

    public static DateTime convertZuluTimeStringToDate(String timeString) {
        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
        return fmt.parseDateTime(timeString);
    }

}
