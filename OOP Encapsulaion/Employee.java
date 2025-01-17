// Using private instance variables with getter and setter methods is an essential part of encapsulation in object-oriented programming. Here’s why this is considered encapsulation:

// What is Encapsulation?

// Encapsulation is the principle of bundling the data (variables) and the methods (functions) that operate on the data into a single unit, typically a class. It also involves restricting direct access to some of the object’s components, usually through access modifiers like private, and controlling that access using methods (getters and setters).

// Why Use Encapsulation?
// 	1.	Data Protection: By making variables private, you control how they are accessed or modified.
// 	2.	Controlled Access: Getters and setters allow you to validate or transform data before setting or retrieving it.
// 	3.	Maintainability: Changes to the internal structure of the class (e.g., renaming a variable) don’t require changes in external code that interacts with the class.
// 	4.	Abstraction: Encapsulation allows you to hide implementation details from the user and expose only the necessary parts of the class.

// Example of Encapsulation

class Employee {
    private String name; // Private variable
    private int salary;  // Private variable

    // Constructor to initialize employee data
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Setter for salary with validation
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }
}

// Key Points
// 	1.	Private Variables: The variables name and salary are private, so they cannot be directly accessed from outside the class.
// 	2.	Getter and Setter: These methods provide controlled access to the variables, enforcing rules (like validation for salary) or logic as needed.
// 	3.	Encapsulation in Action:
// 	•	Direct access is restricted.
// 	•	External classes or methods interact with the object only through its public methods.

// Example Usage

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);

        // Accessing and modifying private data through encapsulation
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Updating salary with validation
        emp.setSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());

        // Attempt to set invalid salary
        emp.setSalary(-1000); // Invalid salary!
    }
}

// Conclusion

// Whenever you use private instance variables along with getters and setters to provide controlled access, it is an implementation of encapsulation. It ensures that the internal state of the object is well-protected and managed only through the defined methods, keeping your code secure, modular, and maintainable.