package Lab1;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swój numer: ");
        String number = in.next();

        NumberToWords n = new NumberToWords(number);
        //n.getByte();

        System.out.println(n.getWords());

    }
}
