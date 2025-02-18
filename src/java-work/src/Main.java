
import javax.crypto.Cipher;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.TimeZone;


public class Main {


    public static int parking(int[] positions){
        int moves = 0;
        for (int i = 1; i < positions.length; i++) {
            int expected = positions[0] + i;
            moves += Math.abs(positions[i] - expected);
        }

        return moves;
    }

    public static void main(String[] args) throws Exception {

        int[] d = {3,5,7,9};
        int f  = parking(d);
        System.err.println(f);

    }
}