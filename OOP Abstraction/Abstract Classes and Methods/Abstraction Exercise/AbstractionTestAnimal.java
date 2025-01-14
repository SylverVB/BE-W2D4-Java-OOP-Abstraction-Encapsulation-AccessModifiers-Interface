// Testing the Classes:

// You can test the Cat class by creating a Cat object and calling the methods:

public class AbstractionTestAnimal {
    public static void main(String[] args) {
        // Creating a Cat object
        Animal cat = new Cat();  // Upcasting Cat to Animal (valid)
        
        // Calling the methods
        cat.makeSound(); // Expected: Meow!
        cat.exist();     // Expected: The animal is existing... The cat is existing in its own way...
        
        // Calling a method specific to Cat class
        if (cat instanceof Cat) {  // Check if it's an instance of Cat
            Cat specificCat = (Cat) cat;
            specificCat.scratch();  // Expected: The cat is scratching...
        }
    }
}

// Output:

// Animal constructor called!
// Cat constructor called!
// Meow!
// The animal is existing...
// The cat is existing in its own way...
// The cat is scratching...