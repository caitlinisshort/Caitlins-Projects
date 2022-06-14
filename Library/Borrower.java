package Library;

public class Borrower {

    public String name;
    public boolean hasPastDue;
    public String[] borrowedItems;
    public int borrowerId;

    
    //constructor
    public Borrower(String name) {
    	int borrowerID = 0;
        this.borrowerId = borrowerID + 1;
        this.name = name;
        this.hasPastDue = false;
        borrowerID ++;
        //this.borrowedItems = [];
    }

    public static String getBorrower(Borrower user) {
    	return "Borrower ID: " + user.borrowerId + "\nBorrower Name: " + user.name + "\nAccount Past Due: " +
                user.hasPastDue;
    }
    //Main method.... used for testing, comment once done because main class LibraryMain will contain the executable
    /*public static void main(String[] args) {
        Borrower Connerly = new Borrower("Caitlin Connerly");
        Borrower Roxy = new Borrower("Roxy the Dog");
        System.out.println(getBorrower(Connerly));
        System.out.println(getBorrower(Roxy));
    }*/
}