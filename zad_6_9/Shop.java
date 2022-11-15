package zad_6_9;

public class Shop implements Printable
{
    String shop;
    Shop(String shop)
    {
        this.shop=shop;
    }
    public void print() {
        System.out.println(shop + " ");
    }
}
