package Lab1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main (String[] args){
        final int liczba = 0b1101_1000;
        String hexStr = Integer.toString(liczba,16);
        String triStr = Integer.toString(liczba,3);

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swój system: ");

        String system = in.next();

        switch (system){
            case "dziesięć":{
                System.out.println("Liczba w systemie 10-tnym wynosi: " + liczba);
                break;
            }
            case "trzy":{
                System.out.println("Liczba w systemie 3-kowym wynosi: " + triStr);
                break;
            }
            case "szesnaście":{
                System.out.println("Liczba w systemie 16-kowym wynosi: " + hexStr);
                break;
            }
            default:
                System.out.println("Podano zły system");
        }
    }
}
