package practice1;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball("small",1);
        System.out.println(ball.toString());
        ball.setWeight(2);
        System.out.println(ball.getWeight());
    }
}
