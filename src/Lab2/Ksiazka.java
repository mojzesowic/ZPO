package Lab2;

public class Ksiazka implements Publikacja {

    private String title;
    private String author;
    private int pages;

    public Ksiazka(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public String toString(){
        return String.format("Tytul: %s, autor: %s, strony: %d", title, author, pages);
    }
}
