package practice3.N2;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,1,2,2);
        movablePoint.moveRight();
        movablePoint.moveDown();
        System.out.println(movablePoint);

        MovableCircle movableCircle = new MovableCircle(2,4,4,1,1);
        movableCircle.moveLeft();
        movableCircle.moveUp();
        System.out.println(movableCircle);

        MovableRectangle movableRectangle = new MovableRectangle(1,1,5,5,1,1);
        movableRectangle.moveRight();
        movableRectangle.moveDown();
        System.out.println(movableRectangle);
    }
}
