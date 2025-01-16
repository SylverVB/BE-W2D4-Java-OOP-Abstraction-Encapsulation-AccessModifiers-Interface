// Exercise

// Write a class that implements the CharSequence interface found in the java.lang package. Your implementation should return the string backwards. Select one of the sentences from this book to use as the data. Write a small main method to test your class; make sure to call all four methods.

// Class that implements the CharSequence interface
public class ReverseCharSequence implements CharSequence {
    private String data;

    // Constructor to initialize the string
    public ReverseCharSequence(String data) {
        if (data == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        this.data = data;
    }

    // Returns the character at a specific index (reversed)
    @Override
    public char charAt(int index) {
        if (index < 0 || index >= data.length()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + data.length());
        }
        return data.charAt(data.length() - 1 - index);
    }

    // Returns the length of the string
    @Override
    public int length() {
        return data.length();
    }

    // Returns a subsequence of the string in reversed order
    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > data.length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid start or end indices.");
        }
        StringBuilder reversedSubSequence = new StringBuilder(data.substring(start, end));
        return reversedSubSequence.reverse().toString();
    }

    // Returns the reversed string as a String representation
    @Override
    public String toString() {
        return new StringBuilder(data).reverse().toString();
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Example string to test
        String sentence = "Java programming is fun!";
        ReverseCharSequence reverseCharSequence = new ReverseCharSequence(sentence);

        // Test charAt method
        System.out.println("Character at index 2 (reversed): " + reverseCharSequence.charAt(2));

        // Test length method
        System.out.println("Length of the string: " + reverseCharSequence.length());

        // Test subSequence method
        System.out.println("Subsequence (3, 10) reversed: " + reverseCharSequence.subSequence(3, 10));

        // Test toString method
        System.out.println("Reversed string: " + reverseCharSequence.toString());
    }
}