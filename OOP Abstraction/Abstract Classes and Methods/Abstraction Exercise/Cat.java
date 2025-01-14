// Cat class extends Animal
public class Cat extends Animal {

    // Constructor for Cat class
    public Cat() {
        // Calling the parent class (Animal) constructor
        super();
        System.out.println("Cat constructor called!");
    }

    // Implementation of abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    // Optionally override the exist method
    @Override
    public void exist() {
        // Call the superclass method if desired, or provide custom implementation
        super.exist();
        System.out.println("The cat is existing in its own way...");
    }
    
    // You can also add any cat-specific methods here
    public void scratch() {
        System.out.println("The cat is scratching...");
    }
}

// Explanation:
// 	1.	Constructor:
// 	    • The Cat class has a constructor which calls the Animal class’s constructor using super(). This ensures that the Animal class’s initialization (i.e., printing "Animal constructor called!") happens first.
// 	    • Then, the constructor prints "Cat constructor called!" to indicate the Cat object is being created.
// 	2.	Abstract Method Implementation:
// 	    • The Cat class provides an implementation for the abstract method makeSound(), which prints "Meow!" when called.
// 	3.	Override Concrete Method:
// 	    • The Cat class optionally overrides the exist() method, calling the superclass’s version of exist() and then adding its own specific behavior: "The cat is existing in its own way...".
// 	4.	Additional Method:
// 	    • A scratch() method is added to the Cat class to demonstrate cat-specific behavior.

// Summary:
// 	• The Cat class extends the abstract Animal class, providing concrete implementations of the abstract methods.
// 	• The constructor in Cat calls the Animal constructor with super().
// 	• The makeSound() method is implemented, providing a specific behavior for cats.
// 	• The exist() method is optionally overridden in the Cat class to provide custom behavior while also calling the Animal version.