package Lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DniWojny {
    public static void main(String[] args) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String inputString1 = "01 09 1939";
        String inputString2 = "08 05 1945";

        try {
            Date date1 = myFormat.parse(inputString1);
            Date date2 = myFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            System.out.println ("Wojna trwała: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + " dni");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
