package Lab1;

import java.util.Scanner;

public class zadanie2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swój numer PESEL: ");
        String pesel = in.next();

        PeselChecker peselc = new PeselChecker(pesel);

        if (peselc.isValid() == true){
            System.out.println("Pesel poprawny");
            System.out.println("Data urodzenia: " + peselc.getDay() + "." +
                    peselc.getMonth() + "." +
                    peselc.getYear());
            System.out.println("Płec: " + peselc.getSex());
        } else
            System.out.println("Błędny pesel");

    }
}
