package zad_1;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MovablePoint obj1 = new MovablePoint(5,4,3,2);
        obj1.moveDown();
        MovableCircle obj2 = new MovableCircle(1,2,3,4,5);
        obj2.moveLeft();
        System.out.println(obj1);
        System.out.println(obj2);
        MovableRectangle obj3 = new MovableRectangle(1,2,3,4,5,6);
        System.out.println(obj3);
    }
}
