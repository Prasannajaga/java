
import javax.crypto.Cipher;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.TimeZone;


public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        System.out.println(ZoneId.getAvailableZoneIds());
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zonedDateTime2 =  ZonedDateTime.now(ZoneId.ofOffset("UTC" , ZoneOffset.ofHours(1)));
        System.err.println(zonedDateTime2);

        System.out.println("TOKYO = " +  zonedDateTime1  + " " + zonedDateTime1.getOffset() +
                "\nINDIA = " + zonedDateTime  +" " + zonedDateTime.getOffset());
    }
}