// Exercise

// Add a public method called Payroll that:

//  • Takes as input an int called AverageSalary
//  • Returns an int value TotalPayroll calculated as numOfEmployees multiplied by AverageSalary.

class EmployeeCount {
    private int numOfEmployees = 0;

    public void setNumOfEmployees(int count) {
        numOfEmployees = count;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    // New method: Payroll
    public int Payroll(int AverageSalary) {
        return numOfEmployees * AverageSalary;
    }
}

public class EncapsulationExample {
    public static void main(String args[]) {
        EmployeeCount obj = new EmployeeCount();
        obj.setNumOfEmployees(5613);

        int averageSalary = 50000; // Example salary
        int totalPayroll = obj.Payroll(averageSalary);

        System.out.println("No Of Employees: " + obj.getNumOfEmployees());
        System.out.println("Total Payroll: " + totalPayroll);
    }
}


// We don’t need to explicitly use the getNumOfEmployees method in the Payroll method if we are accessing the private variable numOfEmployees directly within the same class. This is because a class has direct access to its own private members.

// However, if we want to follow best practices and ensure that access to the private field is consistent (even within the class), we can use the getNumOfEmployees method inside the Payroll method. This approach is particularly useful if we later modify how numOfEmployees is accessed or computed in the getNumOfEmployees method.

// Here’s how it looks with the getNumOfEmployees method:

// Using getNumOfEmployees in Payroll

class EmployeeCount {
    private int numOfEmployees = 0;

    public void setNumOfEmployees(int count) {
        numOfEmployees = count;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public int Payroll(int AverageSalary) {
        // Use the getter method instead of directly accessing the field
        return getNumOfEmployees() * AverageSalary;
    }
}

public class EncapsulationExample {
    public static void main(String args[]) {
        EmployeeCount obj = new EmployeeCount();
        obj.setNumOfEmployees(5613);

        int averageSalary = 50000; // Example salary
        int totalPayroll = obj.Payroll(averageSalary);

        System.out.println("No Of Employees: " + obj.getNumOfEmployees());
        System.out.println("Total Payroll: " + totalPayroll);
    }
}

// Why Use the Getter?
// 	1.	Encapsulation: By using the getter, you adhere to the principle of encapsulation. If getNumOfEmployees contains logic beyond simply returning the value (e.g., data validation or transformation), the Payroll method will still work correctly.
// 	2.	Consistency: Using the getter ensures that all access to numOfEmployees is handled in the same way, even within the class. This makes future maintenance easier.
// 	3.	Flexibility: If you later decide to calculate or retrieve numOfEmployees dynamically (e.g., from a database), the Payroll method won’t need to be updated as long as the getNumOfEmployees method handles this.

// Summary
// 	•	Direct access to the private field numOfEmployees is fine because Payroll is in the same class.
// 	•	Using the getter method (getNumOfEmployees) is better for consistency, encapsulation, and maintainability.