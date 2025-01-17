package Interfaces.VideoExample;

public class BasketballPlayer implements BallHandler, Shooter {
    String name;

    // Constructor
    public BasketballPlayer(String name) {
        this.name = name;
    }

    // Implementing the BallHandler interface's abstract method
    @Override
    public void dribbleBall() {
        System.out.println(name + " dribbles the ball off someone's shoe and out of bounds.");
    }

    // Implementing the Shooter interface's method
    @Override
    public String takeShot(String shot) {
        return "The basketball player hits a " + shot + "! The crowd goes wild!";
    }
}