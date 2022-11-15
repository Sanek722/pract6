package zad_1;

public class MovableCircle implements Movable
{
    int radius;
    MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
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
        return "MovableCircle{" +
                "radius=" + radius +
                ", x=" + center.x +
                ", y=" + center.y +
                ", xSpeed=" + center.xSpeed +
                ", ySpeed=" + center.ySpeed +
                '}';
    }
}
