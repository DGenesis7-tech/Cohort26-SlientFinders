const prompt = require('prompt-sync')();

function booksStatus(books, bookStatus) {
	for (let index = 0; index < 10; index++) {
		console.log(`${index + 1}. ${books[index]}: ${bookStatus[index]}`);
	}	
}

function optionsMenu(options) {
	console.log();
	console.log();
	console.log("Welcome to Genesis Prototype Library ::>");
	console.log();
	console.log(`
	Select from options (1-4) to use app: )
	1. View all books and status.
	2. Borrow a book.
	3. Return a book.
	4. Exit.
	`);
	options = Number(prompt(": "));
return options;
}

function borrowedBook(bookStatus) {
	console.log("Choose a book to borrow by selecting its number: ");
	let response = Number(prompt(": "));
	if (bookStatus[response - 1] == "Available") {
		bookStatus[response - 1] = "Borrowed";
		console.log("This book was just borrowed by you!!!");
	}
	else {
		console.log("This book has been borrowed or is not available in this library, wait till it has been returned and try again ");
	}
return bookStatus;
}

function returnBook(bookStatus) {
	console.log("Chook a book to return by selecting its number: ");
	let response = Number(prompt(": "));
	if (bookStatus[response - 1] == "Borrowed") {
		bookStatus[response - 1] = "Available";
		console.log("This book was just retured by you!!!");
	}
	else {
		console.log("This book was retured already and doesn't belong here, we dont accept duplicates try another library or borrow this library's copy");
	}
return bookStatus;
}

let books = [];
let bookStatus = [];
for (let index = 0; index < 10; index++) {
books[index] = (`Book${index + 1}`); 
bookStatus[index] = "Available";
}	

let options = 0;

while (options != 4) {
	options = optionsMenu(options);
	
	switch (options) {
		case 1: booksStatus(books, bookStatus);
		break;
		case 2: bookStatus = borrowedBook(bookStatus);
		break;
		case 3: bookStatus = returnBook(bookStatus);
		break;
		case 4: console.log("EXITING!!!!");
 		break;
 		default: console.log("Please select from the availaibe options. Adhere to instructions, Thank you");
 		break;		
	}
}


