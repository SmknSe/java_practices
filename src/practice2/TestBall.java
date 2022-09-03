package practice2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10.5,7.3);
        Ball ball1 = new Ball();
        ball1.setXY(12,3);
        ball.move(2,3.6);
        System.out.println(ball.toString());
        System.out.println(ball1.toString());
    }
}
