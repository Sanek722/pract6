package zad_6_9;

public class Book implements Printable{

    String book;
    Book(String book)
    {
        this.book=book;
    }
    public void print() {
        System.out.println(book + " ");
    }

}
