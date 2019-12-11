package pracs.prac1;

public class Book {
    private String author;
    private String name;
    private int pages;
    public Book(String author, String name, int pages)
    {
        this.author=author;
        this.name=name;
        this.pages=pages;
    }
    public Book()
    {
        author="";
        name="";
        pages=0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "\""+name+"\" by "+author+' '+pages+" pages";
    }
}
