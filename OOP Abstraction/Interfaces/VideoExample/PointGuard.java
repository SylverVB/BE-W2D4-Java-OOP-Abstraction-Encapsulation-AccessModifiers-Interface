package Interfaces.VideoExample;
public class PointGuard implements BallHandler {
    String name;

    // Constructor
    public PointGuard(String name) {
        this.name = name;
    }

    // Method from the BallHandler interface
    @Override
    public void dribbleBall() {
        System.out.println(name + " dribbles the ball and blows past the defender!");
    }
}