package Interfaces.VideoExample;

public interface BallHandler {
    // Constant variable. Interface variables are public, static, and final by definition.
    String sport = "Basketball";

    // Concrete Method (static method)
    public static void dropTheBall() {
        System.out.println("The ball bounces a couple of times, rolls away, and then just sits there.");
    }

    // Abstract Method
    public void dribbleBall();
}