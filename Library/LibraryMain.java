package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibraryMain {

    public int totalItems;
    public int totalAvailableItems;
    public int totalCheckedOutItems;

    public static void checkOutItem(LibraryItems item, Borrower lastName) {
        item.isAvailable = false;
        item.borrower = lastName.name;
        item.dueDate = "some day";
        item.isPastDue = false;
        lastName.hasPastDue = false;
        System.out.println("Item: " + item.title + " has been checked out by: " + lastName.name);
        ManageItems checkOut = new ManageItems();
        String borrowedTitle = item.title;
        String borrower = item.borrower;
        checkOut.modifyItem("false", "test borrower", borrowedTitle);
    }

    public static void checkInItem(LibraryItems item, Borrower lastName) {
        item.isAvailable = true;
        item.borrower = null;
        item.dueDate = null;
        item.isPastDue = false;
        lastName.hasPastDue = false;
        System.out.println("Item: " + item.title + " has been checked in by: " + lastName.name);
        ManageItems checkIn = new ManageItems();
        String titleToCheckIn = item.title;
        String borrowerName = item.borrower;
        checkIn.modifyItem("true", borrowerName, titleToCheckIn);
    }

    public static void inventoryManagement() {
    	
    }
    
    	
    public static void main(String[] args) {
        LibraryItems testBook = new LibraryItems("Test Title", "Test Author", "Test Genre", "1234567891234");
        ManageItems addNew = new ManageItems();
        addNew.addItem("Test Title", "Test Author", "Test Genre", "1234567891234");
        Borrower Connerly = new Borrower("Caitlin Connerly");
        System.out.println(testBook.isAvailable);
        checkOutItem(testBook, Connerly);
        System.out.println(testBook.isAvailable);
        System.out.println(testBook.author);
        
    }
    
}

