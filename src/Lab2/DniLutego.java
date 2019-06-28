package Lab2;

import java.time.LocalDate;
import java.time.Month;

public class DniLutego {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1993, Month.DECEMBER, 4);
        LocalDate localDate = birthday;
        int counter = 0;
        while(localDate.isBefore(LocalDate.now())){
            localDate = localDate.plusDays(1);
            if(localDate.toString().contains("-02-29")){
                counter++;
                //System.out.println("---------------------------");
            }
        }
        System.out.println("Przeżyłem " + counter + " dni 29 lutego.");
    }
}
