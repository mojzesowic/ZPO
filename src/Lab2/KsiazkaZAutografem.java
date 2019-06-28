package Lab2;

public class KsiazkaZAutografem extends OkladkaDekorator {
    public KsiazkaZAutografem(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String toString(){
        return super.toString() + " z autografem";
    }
}
