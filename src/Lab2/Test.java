package Lab2;

public class Test {
    public static void main(String[] args) {

        Ksiazka ksiazka = new Ksiazka("a", "b", 10);
        System.out.println(ksiazka);

        Publikacja k2 = new KsiazkaZObwoluta("Adam Mickiewicz", "Pan Tadeusz", 340);
        System.out.println(k2);
        
    }
}
