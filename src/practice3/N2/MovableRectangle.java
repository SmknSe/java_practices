package practice3.N2;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    public boolean checkX(){
        return topLeft.xSpeed == bottomRight.xSpeed;
    }

    public boolean checkY(){
        return topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp() {
        if (checkY()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (checkY()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (checkX()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveRight() {
        if (checkX()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}
