package Lab2;

public class KsiazkaZObwoluta extends OkladkaDekorator {

    Ksiazka ksiazka;

    public KsiazkaZObwoluta(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String toString(){
        return super.toString() + " z obwoluta";
    }
}
