import java.util.Scanner;

public class Stack_Array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a scanner object to read input from the user
        System.out.print("Enter size of Stack: ");
        int n = sc.nextInt(); // Read the size of the stack from the user
        Stack st = new Stack(n); // Create a new stack of the given size

        boolean flag = true;
        int val;
        int pos = 0;
        while (flag) { // Loop to provide a menu for stack operations

            // Display menu options
            System.out.println("1. Push item in Stack");
            System.out.println("2. Pop item out from Stack");
            System.out.println("3. Current size of stack");
            System.out.println("4. Update value at position");
            System.out.println("5. View value at position");
            System.out.println("6. View Stack");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt(); // Read the user's choice
            switch (choice) { // Perform actions based on user's choice

            case 1:
                System.out.print("Enter value: ");
                val = sc.nextInt(); // Read the value to push onto the stack
                st.push(val); // Push the value onto the stack
                break;

            case 2:
                System.out.println(st.pop()); // Pop the top value from the stack and print it
                break;

            case 3:
                System.out.println(st.count()); // Print the current size of the stack
                break;

            case 4:
                System.out.print("Enter value: ");
                val = sc.nextInt(); // Read the new value to update
                System.out.print("Enter position: ");
                pos = sc.nextInt(); // Read the position to update
                st.updateValue(pos, val); // Update the value at the given position
                break;

            case 5:
                System.out.print("Enter position: ");
                pos = sc.nextInt(); // Read the position to view
                System.out.println(st.peek(pos)); // Print the value at the given position
                break;

            case 6:
                st.display(); // Display all elements in the stack
                break;

            case 7:
                flag = false; // Exit the loop
                break;

            default:
                System.out.println("Invalid Choice"); // Handle invalid menu choices
            }
            System.out.println();
        }

        sc.close(); // Close the scanner object
    }
}

class Stack {
    private int top; // Index of the top element in the stack
    private int arr[]; // Array to store stack elements
    private int n; // Maximum size of the stack

    // Constructor to initialize the stack
    public Stack(int n) {
        top = -1; // Initialize top to -1 to indicate the stack is empty
        this.n = n; // Set the maximum size of the stack
        arr = new int[this.n]; // Create an array of the specified size
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // Return true if top is -1, indicating the stack is empty
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == n - 1; // Return true if top is equal to the last index, indicating the stack is full
    }

    // Push an element onto the stack
    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow"); // Print message if stack is full
        } else {
            top++; // Increment top to point to the next empty position
            arr[top] = val; // Add the element at the top position
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow"); // Print message if stack is empty
            return 0; // Return 0 to indicate an error
        } else {
            int popValue = arr[top]; // Store the top element in a variable
            arr[top] = 0; // Clear the top element
            top--; // Decrement top to point to the new top element
            return popValue; // Return the popped value
        }
    }

    // Get the current size of the stack
    public int count() {
        return top + 1; // Return the number of elements in the stack
    }

    // Peek the top element of the stack
    public int Top() {
        if (isEmpty()) {
            System.out.println("Stack Underflow"); // Print message if stack is empty
            return 0; // Return 0 to indicate an error
        }
        return arr[top]; // Return the top element
    }

    // Access the value at a given position
    public int peek(int pos) {
        if (isEmpty()) {
            System.out.println("Stack Underflow"); // Print message if stack is empty
            return 0; // Return 0 to indicate an error
        } else {
            return arr[pos]; // Return the value at the given position
        }
    }

    // Update the value at a given position
    public void updateValue(int pos, int val) {
        if (pos > count()) {
            System.out.println("Stack Overflow"); // Print message if position is out of bounds
        } else {
            arr[pos - 1] = val; // Update the value at the given position
            System.out.println("Value Updated at position " + pos); // Print confirmation message
        }
    }

    // Display all elements in the stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty"); // Print message if stack is empty
        } else {
            System.out.println("All values in the Stack are: ");
            for (int i = top; i >= 0; i--) { // Loop through the stack from top to bottom
                System.out.println(arr[i]); // Print each element
            }
        }
    }
}
