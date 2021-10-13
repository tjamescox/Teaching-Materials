/* Author: Jalen D. Brodnex
CSCI 2302 
HW#1 - Chapter 2: P2.33 - Ebook Reader 
Due Date: 2/2/21
Professor Ken Nguyen
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
//Start of code
import java.util.Scanner;

//Declare public class
public class EbookReader {
	//public static void main(String [] args) { // need for main method just yet, main method is for the instructions you want the computer to execute
		
		//Varibles 
		String book;
		String user;
		String display;
		String bookPurchase;
		
		//Constructor
		// remember to use the this. operator!  Helps the computer disipher between memory location (variable) and instance variable (variables found in parameters of constructor)
		public EbookReader(String book, String user, String display, String bookPurchase) {
			this.book = book;
			this.user = user;
			this.display = display;
			this.bookPurchase = bookPurchase;
		}
		
		//Declare getters
		public String getBook() {
			return this.book;
		}
		public String getUser() {
			return this.user;
		}
		public String getDisplay() {
			return this.display;
		}
		public String getPurchase() {
			return this.bookPurchase;
		}
		
		//Declare setters
		public void setBook(String activeBook) {
			this.book = activeBook;
			//display Book;
		}
		public void setActiveUser(String activeUser) {
			this.user = activeUser;
			//display User;
		}
		public void setBookPurchase(String activeBookPurchase){
			this.bookPurchase = activeBookPurchase;
			//display bookPurchase;
		}
	} // end of class EbookReader (was missing before)
		
		//Declare Book as class.
		class Book {
			public Book searchBookByTitle(String title) {}
			public Book searchBookByAuthor(String author) {}
			public Book searchBookByPublisher(String publisher) {}
			public Book searchBookByISBN(int ISBN) {
			}
		
		
		//Declare book being added using ISBN.
		public void addNewBook(Book newBook) {
			if (books.containKey(newBook.ISBN)) // What is containKey() method and books?  It is not defined
				return;
				books.put(newBook.ISBN,newBook); // What is put() method, ISBN, and books?  It is not defined
		}
		//Declare book being removed using ISBN.
		public void removeBook(int ISBN) {
			if(books.containsKey(ISBN)) 
				books.remove(ISBN);
		}
		} // end of class Book
		
		//Declare BookPurchase as class.
		class BookPurchase {
			//Declare variables
			int ISBN;
			String author;
			String title;
			String publisher;
			int yearOfPub;
			int numPages;
			double weight;
		}// end of class BookPurchase
		
		//Declare User as a class.
		class User {
			//Variables
			boolean isMember;
			int lastMembershipRenewed = 0;
			//90 days
			int membershipDuration = 90;
			
			public void renewMembership() {
				isMember = true;
				lastMembershipRenewed += membershipDuration;
			}
		} // end of user Class
		//Declare Display as class.
		class Display {
			//Variables
			String Book;
			String User;
			int currentPage;
			
			public void nextPage() {
				if (currentPage == Book.numPages)
					return;
				else
					currentPage++;
			}
			public void previousPage() {
				if (currentPage == 0)
					return;
				else
					currentPage--;
			}
			public void User(String User) {
				this.User = User;
			}
			public void Book(String Book) {
				currentPage = 0;
				this.Book = Book;
			}
		} // end of Display class

	//}
 

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
