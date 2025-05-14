// Define the BankCustomer class
class BankCustomer1 {
    // Fields (attributes)
    String name;
    int accNo;
    int age;

    // Constructor to initialize the BankCustomer object
    BankCustomer1(String name, int accNo, int age) {
        this.name = name;
        this.accNo = accNo;
        this.age = age;
    }

    // Method to display customer details
    void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Age: " + age);
    }
}

// Main class to run the program
public class BankCustomer {
    public static void main(String[] args) {
        // Create a BankCustomer object
        BankCustomer1 customer1 = new BankCustomer1("Alice", 123456, 30);

        // Display customer details
        customer1.displayDetails();
    }
}
