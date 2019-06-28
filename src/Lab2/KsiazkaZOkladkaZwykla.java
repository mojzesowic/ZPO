package Lab2;

public class KsiazkaZOkladkaZwykla extends OkladkaDekorator {

    public KsiazkaZOkladkaZwykla(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String toString(){
        return super.toString() + " z okładka zwykła";
    }
}
