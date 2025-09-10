import java.util.Scanner;

public class TextSpeedConsoleFunctions {

public static int displayMenu(int select) {
	Scanner input = new Scanner(System.in);
	System.out.println();
	System.out.println(""" 
	Welcome to Text Speed Test Console ==>
	Choose from options (1-4) to use console ==>
	1. Take the test (you must input the words and characters as they are).
	2. Know test time taken, Words per minute and Accuracy percentage. 
	3. Exit.
	""");
	select = input.nextInt();
return select;	
}

public static String display() {
	String display = "For many decades, some powerful trends have been in place. Computer hardware has rapidly been getting faster, cheaper and smaller.";
return display;	
}


public static String displayTest() {
	Scanner input = new Scanner(System.in);
	System.out.println("Test started. press Enter to end");
	System.out.println();
	System.out.println("""
	For many decades, some powerful trends have been in place. Computer hardware has rapidly been getting faster, cheaper and smaller.
	""");
	System.out.println();
	String typing = input.nextLine();	
return typing;
}

public static void totalTimeTaken(long timeTakenMillisec) {
// 1sec = 1000ms, 1min = (60 * 1)sec = (60 * 1000)ms, 1hr = (60 * 1)min = (60 * 60)sec = (3600 * 1000)ms )

	long toHours = timeTakenMillisec / 3600000;  
	timeTakenMillisec = timeTakenMillisec % 3600000;
	long toMinutes = timeTakenMillisec / 60000;
	timeTakenMillisec = timeTakenMillisec % 60000;
	long toSeconds = timeTakenMillisec / 1000;
	timeTakenMillisec = timeTakenMillisec % 1000;

	System.out.printf("Total test time is %dhrs %dmins %dsecs %dmillisecs %n", toHours, toMinutes, toSeconds, timeTakenMillisec);
}

public static void wordsPerMin(long timeTakenMillisec, double wordsPerMin) {
	long toHours = timeTakenMillisec / 3600000;  
	timeTakenMillisec = timeTakenMillisec % 3600000;
	double toMinutes = timeTakenMillisec / 60000.0;
	wordsPerMin = 20 / toMinutes;
	System.out.printf("Estimated words per min is %.2f wpm %n", wordsPerMin);
}	

public static void accuracy(long timeTakenMillisec) {
	double secondsAccuracy = 40.0 * 1000.0;
	double accuracy = (secondsAccuracy / timeTakenMillisec) * 100;
	System.out.printf("Percentage of accuracy is %.2f%%", accuracy);
	System.out.println();
}



}