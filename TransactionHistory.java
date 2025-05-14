import java.text.SimpleDateFormat;
import java.util.Date;

// Define the TransactionHistory class
class TransactionHistory1 {
    // Fields (attributes)
    int transactionId;
    String senderName;
    String receiverName;
    String status;
    Date date;
    double amount;

    // Constructor to initialize the TransactionHistory object
    TransactionHistory1(int transactionId, String senderName, String receiverName, String status, Date date, double amount) {
        this.transactionId = transactionId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.status = status;
        this.date = date;
        this.amount = amount;
    }

    // Method to display transaction details
    void displayDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Sender Name: " + senderName);
        System.out.println("Receiver Name: " + receiverName);
        System.out.println("Status: " + status);
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("Amount: " + amount);
    }
}

// Main class to run the program
public class TransactionHistory {
    public static void main(String[] args) {
        // Create a Date object for the current date and time
        Date currentDate = new Date();

        // Create a TransactionHistory object
        TransactionHistory1 transaction1 = new TransactionHistory1(1001, "Alice", "Bob", "Completed", currentDate, 1500.75);

        // Display transaction details
        transaction1.displayDetails();
    }
}
