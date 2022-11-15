package zad_1;

public class MovableRectangle implements Movable
{
    MovablePoint topLeft;
    MovablePoint topRight;
    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        topRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public String  prover()
    {
        if(topLeft.xSpeed == topRight.xSpeed && topLeft.ySpeed == topRight.ySpeed)
        {
            return "Точки имеют одну и ту же скорость";
        }
        else
        {
            return "Точки имеют разную скорость";
        }
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
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                "} \n" + prover();
    }
}
