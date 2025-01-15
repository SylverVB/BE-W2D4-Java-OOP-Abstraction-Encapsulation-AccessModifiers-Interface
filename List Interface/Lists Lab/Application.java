import java.util.List;

public class Application {
    public static void main(String[] args) {
        Lab lab = new Lab();  // Create an instance of the Lab class

        // Create a new list using the method from Lab
        List<Integer> integerList = lab.createList();

        // Add some values to the list
        lab.addToList(integerList, 5);
        lab.addToList(integerList, 10);
        lab.addToList(integerList, 15);

        // Print the list
        System.out.println("List: " + integerList);  // Output: [5, 10, 15]

        // Get and print the size of the list
        System.out.println("Size of the list: " + lab.getSize(integerList));  // Output: 3

        // Get and print an element at a specific index
        System.out.println("Element at index 1: " + lab.get(integerList, 1));  // Output: 10

        // Update the element at index 1
        lab.updateAtPosition(integerList, 1, 20);
        System.out.println("Updated list: " + integerList);  // Output: [5, 20, 15]

        // Remove the element at index 0
        lab.removeFromList(integerList, 0);
        System.out.println("List after removal: " + integerList);  // Output: [20, 15]
    }
}