package Library;

public class Borrower {

    public String name;
    public boolean hasPastDue;
    public String[] borrowedItems;
    public int borrowerId;

    int borrowerID = 0;
    
    //constructor
    public Borrower(String name) {
        this.borrowerId = borrowerID + 1;
        this.name = name;
        this.hasPastDue = false;
        borrowerID ++;
        //this.borrowedItems = [];
    }

    public String getBorrower() {
        return "Borrower ID: " + this.borrowerId + "\nBorrower Name: " + this.name + "\nAccount Past Due: " +
                this.hasPastDue;
    }
    //Main method.... used for testing, comment once done because main class LibraryMain will contain the executable
    /* public static void main(String[] args) {
        Borrower Connerly = new Borrower("Caitlin Connerly");
        System.out.println(getBorrower(Connerly));
    }*/
}