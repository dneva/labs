package pracs.prac1;

import java.util.Scanner;

public class TestBook {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        String name = sc.nextLine();
        String author = sc.nextLine();
        int pages = sc.nextInt();
        b.setName(name);
        b.setAuthor(author);
        b.setPages(pages);
        System.out.println("This is "+b.toString());
    }
}
