package Library;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;  

public class ManageItems {
	
	public Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:D:/10_Coding Work/IDE Settings and Config/Eclipse IDE S&C/ConnerlyLibrary/LibItemsData.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }
	
	public void addItem(String title, String author, String genre, String isbn) {
		String sql = "INSERT INTO LibItems(Title, Author, Genre, ISBN) VALUES(?,?, ?, ?)";  
	    try{  
	     Connection conn = this.connect();  
	     PreparedStatement pstmt = conn.prepareStatement(sql);  
	     pstmt.setString(1, title);  
	     pstmt.setString(2, author);  
	     pstmt.setString(3, genre);
	     pstmt.setString(4, isbn);
	     pstmt.executeUpdate();  
	    } catch (SQLException e) {  
	    	System.out.println(e.getMessage());  
	    } 
	}
	
	public void deleteItem(String title) {
	   String sql = "DELETE FROM LibItems WHERE title = ?";

	     try (Connection conn = this.connect();
	    		 PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            // set the corresponding param
	            pstmt.setString(1, title);
	            // execute the delete statement
	            pstmt.executeUpdate();

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	
	public void modifyItem(String availability, String borrower, String title) {   
		String sql = "UPDATE LibItems SET availability = ? , " + 
				   		"borrower = ?  " +
				   		"WHERE title = ?";

		try (Connection conn = this.connect();
		    	PreparedStatement pstmt = conn.prepareStatement(sql)) {

		         // set the corresponding param
		         pstmt.setString(1, availability);
		         pstmt.setString(2, borrower);
		         pstmt.setString(3, title);
		         // execute the delete statement
		         pstmt.executeUpdate();

		 } catch (SQLException e) {
		       System.out.println(e.getMessage());
		   }
	}
}
