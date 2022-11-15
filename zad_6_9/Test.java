package zad_6_9;

public class Test
{
    public static void main(String[] args) {
        Printable obj1 = new Book("Гарри Поттер");
        Printable obj2 = new Book("Кладбище домашних животных");
        Printable obj3 = new Book("Оно");
        Printable obj4 = new Shop("Playboy");
        Printable obj5 = new Shop("Forbes");
        Printable mass[] = new Printable[5];
        mass[0]=obj1;
        mass[1]=obj2;
        mass[2]=obj3;
        mass[3]=obj4;
        mass[4]=obj5;
        for (int i = 0; i < mass.length;i++)
        {
            mass[i].print();
        }
    }
}
