package zad_1;

public class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void moveUp()
    {
        System.out.println("объект переместился вперед");
    }
    public void moveDown()
    {
        System.out.println("объект переместился вниз");
    }
    public void moveLeft()
    {
        System.out.println("объект переместился влево");
    }
    public void moveRight()
    {
        System.out.println("объект переместился вправо");
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
