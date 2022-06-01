package Library;

public class LibraryItems {

    public String title;
    public String author;
    public String genre;
    public String isbn; // Declared ISBN as a string because they are 13 digits long, too big for the int limits,
                        // could use long, but string was selected for ease of creating item info array of all one type
    public boolean isAvailable;
    public String borrower;
    public String dueDate;
    public boolean isPastDue;

    //Library Item constructor
    public LibraryItems(String bookTitle, String bookAuthor, String bookGenre, String ISBN) {
        //Set default/initial values for borrower related data
        this.isAvailable = true;
        this.borrower = null;
        this.dueDate = null;
        this.isPastDue = false;
        //Assign input params to item attributes
        this.title = bookTitle;
        this.author = bookAuthor;
        this.genre = bookGenre;
        this.isbn = ISBN;
    }

    //Getters accessing library items
    public String[] getItemInfo() {
        String[] itemInfo = {this.title, this.author, this.genre, this.isbn};
        return itemInfo;
    }

    public String[] getItemStatus() {
        String availability = String.valueOf(this.isAvailable);
        String status = String.valueOf(this.isPastDue);
        String[] itemStatus = {availability, this.borrower, this.dueDate, status};
        return itemStatus;
    }

}
    //Main method.... used for testing, comment once done because main class Library will contain the main executable
    /*public static void main(String[] args) {
        LibraryItem testBook = new LibraryItem("Test Title", "Test Author", "Test Genre", "1234567891234");
        System.out.println(Arrays.toString(testBook.getItemInfo()));
        System.out.println(Arrays.toString(testBook.getItemInfo()));
    }*/

