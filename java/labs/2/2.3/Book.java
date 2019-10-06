package Lab1;

public class Book {
    private String author;
    private String name;
    private String year;
    public Book(String a, String n, String y) {
        author = a;
        name = n;
        year = y;
    }
public void SetAuthor(String a)
{
     author=a;
}
public void SetName(String n)
{
    name=n;
}
public void SetYear(String y)
{
    year=y;
}
public String GetAuthor()
{
    return author;
}
public String GetName()
{
    return name;
}
public String GetYear()
{
    return year;
}
}
