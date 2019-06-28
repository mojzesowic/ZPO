package Lab2;

public class KsiazkaZOkladkaTwarda extends OkladkaDekorator {

    public KsiazkaZOkladkaTwarda(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String toString(){
        return super.toString() + " z okładka twarda";
    }
}
