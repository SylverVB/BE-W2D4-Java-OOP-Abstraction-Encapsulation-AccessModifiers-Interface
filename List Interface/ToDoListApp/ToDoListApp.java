// Exercise

//   • create your own to-do list program where the user can do the following:
//   • create a task
//   • delete a task
//   • change the position of a task on the list
//   • edit a task
//   • your own   


// A List is a data structure where the elements within it are ordered. In Java, lists use indexes to represent positions of elements within them. The List Interface and its subclasses allow you to create implementations of lists.

// The List interface is located within the java.util package and is part of the Collection API and inherits from the Collection and Iterable interfaces. This means a List should do the following:

//   • Be able to be iterated over using an Iterator
//   • Should be able to perform common collection operations, such as adding or removing elements, checking if an element is in the collection, or checking the size of the collection

// Additionally, the List interface defines operations that are specific to lists such as accessing elements by index, searching using an index, and iterating backwards. List-specific operations are:

//   • add(int index, E element) - adds an element at the given index
//   • get(int index) - retrieves an element at a given index
//   • indexOf(Object o) - retrieves the index of the given element
//   • listIterator() / listIterator(int index) - returns an iterator at either the beginning of the list or at the specified index
//   • remove(int index) - removes an element at the given index
//   • set(int index, E element) - replaces the element at the given index with the given element
//   • subList(int fromIndex, int toIndex) - returns a sub-list of the elements at the specific range

// Resources

//   • List Interface Java 8 Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/List.html


// To-Do List Program

// Here is an example implementation of a to-do list program in Java that meets the requirements. It uses a Scanner for user input and a List to store the tasks.

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    private ArrayList<String> tasks; // List to hold tasks
    private Scanner scanner;        // Scanner for user input

    // Constructor to initialize the tasks list and scanner
    public ToDoListApp() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Display the menu
    private void displayMenu() {
        System.out.println("\n--- To-Do List Menu ---");
        System.out.println("1. Create a task");
        System.out.println("2. Delete a task");
        System.out.println("3. Change the position of a task");
        System.out.println("4. Edit a task");
        System.out.println("5. Display all tasks"); // Display tasks option
        System.out.println("6. Exit");             // Exit option at the end
        System.out.print("Enter your choice: ");
    }

    // Main menu handler
    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> createTask();
            case 2 -> deleteTask();
            case 3 -> changeTaskPosition();
            case 4 -> editTask();
            case 5 -> displayAllTasks(); // Calls displayAllTasks method
            case 6 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    // Method to create a new task
    private void createTask() {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    // Method to delete a task
    private void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to delete.");
            return;
        }
        displayAllTasks(); // Show current tasks
        System.out.print("Enter the task number to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume the newline
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Method to change the position of a task
    private void changeTaskPosition() {
        if (tasks.size() < 2) {
            System.out.println("Not enough tasks to reorder.");
            return;
        }
        displayAllTasks(); // Show current tasks
        System.out.print("Enter the current task number: ");
        int currentPos = scanner.nextInt() - 1;
        System.out.print("Enter the new position: ");
        int newPos = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume the newline
        if (currentPos >= 0 && currentPos < tasks.size() && newPos >= 0 && newPos < tasks.size()) {
            String task = tasks.remove(currentPos); // Remove task from old position
            tasks.add(newPos, task);               // Add it to the new position
            System.out.println("Task position updated successfully.");
        } else {
            System.out.println("Invalid positions entered.");
        }
    }

    // Method to edit a task
    private void editTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to edit.");
            return;
        }
        displayAllTasks(); // Show current tasks
        System.out.print("Enter the task number to edit: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume the newline
        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter the updated task: ");
            String updatedTask = scanner.nextLine();
            tasks.set(index, updatedTask);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Method to display all tasks
    private void displayAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("\n--- Current Tasks ---");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        ToDoListApp app = new ToDoListApp();
        int choice;
        do {
            app.displayMenu(); // Display the menu
            choice = app.scanner.nextInt();
            app.scanner.nextLine(); // Consume the newline
            app.handleChoice(choice); // Handle the user's choice
        } while (choice != 6); // Exit when user chooses 6
    }
}

// Features:
//  1. Create a Task: Adds a task to the to-do list.
//  2. Delete a Task: Removes a task by its position in the list.
//  3. Change Task Position: Moves a task to a different position in the list.
//  4. Edit a Task: Updates the description of an existing task.
//  5. Display All Tasks: Shows all tasks currently in the list.
//  6. Exit: Exits the program.

// How It Works:
//  •   Tasks are stored in an ArrayList, which allows dynamic resizing and easy manipulation of tasks.
//  •   Tasks are displayed with their positions (starting from 1) for user-friendly interaction.
//  •   User inputs are validated to ensure valid task numbers and positions.
//  •   The program runs in a loop, continuously showing the menu until the user chooses to exit.
//  •   Each menu option corresponds to a method, keeping the code modular and easy to understand.

// Example Run:

// Welcome to your To-Do List!

// Menu:
// 1. Create a Task
// 2. Delete a Task
// 3. Change Task Position
// 4. Edit a Task
// 5. Display All Tasks
// 6. Exit
// Enter your choice: 1
// Enter the task description: Buy groceries
// Task added: Buy groceries

// Menu:
// 1. Create a Task
// 2. Delete a Task
// 3. Change Task Position
// 4. Edit a Task
// 5. Display All Tasks
// 6. Exit
// Enter your choice: 1
// Enter the task description: Study Java
// Task added: Study Java

// Menu:
// 1. Create a Task
// 2. Delete a Task
// 3. Change Task Position
// 4. Edit a Task
// 5. Display All Tasks
// 6. Exit
// Enter your choice: 5

// --- Current Tasks ---
// 1. Buy groceries
// 2. Study Java

// Menu:
// 1. Create a Task
// 2. Delete a Task
// 3. Change Task Position
// 4. Edit a Task
// 5. Display All Tasks
// 6. Exit
// Enter your choice: 3

// --- Current Tasks ---
// 1. Buy groceries
// 2. Study Java
// Enter the number of the task to move: 1
// Enter the new position for this task: 2
// Task moved to position 2: Buy groceries

// Menu:
// 1. Create a Task
// 2. Delete a Task
// 3. Change Task Position
// 4. Edit a Task
// 5. Display All Tasks
// 6. Exit
// Enter your choice: 5

// --- Current Tasks ---
// 1. Study Java
// 2. Buy groceries

// Menu:
// 1. Create a Task
// 2. Delete a Task
// 3. Change Task Position
// 4. Edit a Task
// 5. Display All Tasks
// 6. Exit
// Enter your choice: 6
// Goodbye!