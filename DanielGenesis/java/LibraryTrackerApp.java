import java.util.Scanner;
public class LibraryTrackerApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
LibraryTrackerFunctions object = new LibraryTrackerFunctions();

String[][] books = new String[10][2];
for (int index = 0; index < books.length; index++) {
	books[index][0] = "book" + (index + 1);
	books[index][1] = "Available";
}

int options = 0;

while (options != 4) {
	options = object.optionsMenu(options);
	
	switch (options) {
		case 1: object.booksStatus(books);
		break;
		case 2: books = object.borrowedBook(books);
		break;
		case 3: books = object.returnBook(books);
		break;
		case 4: System.out.println("EXITING!!!!");
 		break;
 		default: System.out.println("Please select from the availaibe options. Adhere to instructions, Thank you");
 		break;		
	}
}



}

}