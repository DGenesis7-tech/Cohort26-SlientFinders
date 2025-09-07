import java.util.Scanner;

public class LibraryTrackerFunctions {

public static String[][] booksStatus(String[][] books) {
	for (int index = 0; index < books.length; index++) {
		System.out.println((index + 1) + ". " + books[index][0] + ", " + books[index][1]);
	}	
return books;
}

public static int optionsMenu(int options) {
	Scanner input = new Scanner(System.in); 
	System.out.println();
	System.out.println();
	System.out.println("Welcome to Genesis Prototype Library ::>");
	System.out.println();
	System.out.println("""
	Select from options (1-4) to use app: )
	1. View all books and status.
	2. Borrow a book.
	3. Return a book.
	4. Exit.
	""");
	options = input.nextInt();
return options;
}

public static String[][] borrowedBook(String[][] books) {
	Scanner input = new Scanner(System.in); 
	System.out.print("Choose a book to borrow by selecting its number: ");
	int response = input.nextInt();
	if (books[response - 1][1] == "Available") {
		books[response - 1][1] = "Borrowed";
		System.out.println("This book was just borrowed by you!!!");
	}
	else {
		System.out.println("This book has been borrowed or is not available in this library, wait till it has been returned and try again ");
	}
return books;
}

public static String[][] returnBook(String[][] books) {
	Scanner input = new Scanner(System.in); 
	System.out.print("Chook a book to return by selecting its number: ");
	int response = input.nextInt();
	if (books[response - 1][1] == "Borrowed") {
		books[response - 1][1] = "Available";
		System.out.println("This book was just retured by you!!!");
	}
	else {
		System.out.println("This book was retured already and doesn't belong here, we dont accept duplicates try another library or borrow this library's copy");
	}
return books;
}



}

