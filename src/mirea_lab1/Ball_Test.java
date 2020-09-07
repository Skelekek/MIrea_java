package mirea_lab1;
import java.lang.*;
public class Ball_Test {
    public static void main(String[] args) {
        Ball myBall = new Ball("Red", "Mikasa");
        System.out.println("Ball Colour: " + myBall.getBallColour());
        System.out.println("Ball manufacturer: " + myBall.getballMenufacturer() + "\n");
    }
}
