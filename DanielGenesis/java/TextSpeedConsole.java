import java.util.Scanner;
public class TextSpeedConsole {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
TextSpeedConsoleFunctions object = new TextSpeedConsoleFunctions();

int select = 0;
long timeTakenMillisec = 0;
double wordsPerMin = 0;
String display = object.display();

while (select != 3) {
	select = object.displayMenu(select);
	
	switch (select) {
		case 1: 
		long startTime = System.currentTimeMillis();
		String typing = object.displayTest();
		long endTime = System.currentTimeMillis();

		if (typing.equals(display)) {
			timeTakenMillisec = endTime - startTime;
			System.out.println("Correct input! Time recorded: " + timeTakenMillisec + " millisecs");
		}
		else {
			System.out.println("Input not compatible, try again!!! Please type correctly.");
		}
		break;
		
		case 2: 
		if (timeTakenMillisec > 100000 & timeTakenMillisec <= 140000) {
			object.totalTimeTaken(timeTakenMillisec);
			object.wordsPerMin(timeTakenMillisec, wordsPerMin);
			object.accuracy(timeTakenMillisec);
			System.out.println("You're are quite good in typing accurately, keep practicing");
		}	
		else if (timeTakenMillisec <= 100000 & timeTakenMillisec > 20000) {
			object.totalTimeTaken(timeTakenMillisec);
			object.wordsPerMin(timeTakenMillisec, wordsPerMin);
			object.accuracy(timeTakenMillisec);
			System.out.println("You're are very fast in typing accurately");
		}
		else if (timeTakenMillisec <= 20000) {
			System.out.println("You prolly copied and pasted smarty pants so no result!. DISQUALIFIED!!!");
		}
		else {
			System.out.println("Keep trying to get better!");
		}
		break;
		
		case 3:
		System.out.println("Exiting!!!");
		break;
		
		default:
		System.out.println("Invalid selection, Try again");
		break	;
	}

}

}


}