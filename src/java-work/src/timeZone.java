import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class timeZone {
    public static String DATE_FORMAT = "E d MMM , YYYY HH:mm a";
    public static ZoneId ZONE = ZoneId.of("Asia/Tokyo");

    public static void main(String[] args) {
        // 1. Format using ZonedDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZONE);
        System.out.println("REAL ZDT = " + zonedDateTime);
        String result = zonedDateTime.format(formatter);
        System.out.println("ZONE_DATE_TIME = " + result);

        // 2, Format using LocalDateTime
        String localDateTime = LocalDateTime.now(ZONE).format(formatter);
        System.out.println("LOCAL_DATE_TIME = " + localDateTime); 

        // 3. parse using LocalDateTime
//        LocalDateTime localDateTime1 = LocalDateTime.parse("03-12-2023",formatter);
//        System.out.println("PARSE_LOCAL_DT = " + localDateTime1 );

        // 4. DateFormat using FormatStyle
        String fullStyle = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime);
        System.out.println("FULL = " + fullStyle );

        String longStyle = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(zonedDateTime);
        System.out.println("LONG = " + longStyle );

        String mediumStyle = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(zonedDateTime);
        System.out.println("MEDIUM = " + mediumStyle);

        String shortStyle = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(zonedDateTime);
        System.out.println("SHORT = " + shortStyle);

        List<String> list = Arrays.stream(TimeZone.getAvailableIDs()).filter(val -> val.contains("Asia/K")).collect(Collectors.toList());
        System.out.println(list);
    }
}
