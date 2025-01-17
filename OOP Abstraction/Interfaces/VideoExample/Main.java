package Interfaces.VideoExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("--------- Interfaces ---------");
        System.out.println("------------------------------");
        // Creating BasketballPlayer and PointGuard objects
        BasketballPlayer shaq = new BasketballPlayer("Shaq");
        PointGuard john = new PointGuard("John");

        // Calling the dribbleBall() method implemented from the BallHandler Interface
        john.dribbleBall();
        shaq.dribbleBall();

        System.out.println();

        // Calling the takeShot() method implemented from the Shooter Interface
        System.out.println(shaq.takeShot("Slam Dunk"));

        System.out.println();

        // Printing out the sport variable from the BallHandler Interface
        System.out.println(BallHandler.sport);

        System.out.println();

        // Calling the BallHandler Interface's concrete method directly from the interface
        BallHandler.dropTheBall();
    }
}