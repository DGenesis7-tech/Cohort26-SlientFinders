import java.util.Scanner;

public class TextSpeedTestFunctions {

public static int displayMenu(int select) {
	Scanner input = new Scanner(System.in);
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

public static String display(String display) {
	display = """
	For many decades, some powerful trends have been in place. Computer hardware has rapidly
	been getting faster, cheaper and smaller.
	""";
return display;	
}


public static String displayTest(String typing) {
	Scanner input = new Scanner(System.in);
	System.out.println("Test started. press Enter to end");
	System.out.println("""
For many decades, some powerful trends have been in place. Computer hardware has rapidly
been getting faster, cheaper and smaller.
	""");
	typing = input.nextLine();	
return typing;
}

public static void totalTimeTaken(long timeTakenMillisec) {
// 1sec = 1000ms, 1min = (60 * 1)sec = (60 * 1000)ms, 1hr = (60 * 1)min = (60 * 60)sec = (3600 * 1000)ms )

	int toHours = timeTakenMillisec / 3600000;  
	timeTakenMillisec = timeTakenMillisec % 3600000;
	int toMinutes = timeTakenMillisec / 60000;
	timeTakenMillisec = timeTakenMillisec % 60000;
	int toSeconds = timeTakenMillisec / 1000;
	timeTakenMillisec = timeTakenMillisec % 1000;

	System.out.printf("%dhrs %dmins %dsecs %dmillisecs", toHours, toMinutes, toSeconds, timeTakenMillisec);
}

public static int wordsPerMin(long timeTakenMillisec, int wordsPerMin) {
	timeTakenMillisec = timeTakenMillisec % 3600000;
	int toMinutes = timeTakenMillisec / 60000;
	wordsPerMin = 20 / toMinutes;
return wordsPerMin;
}	

public static double accuracy(long timeTakenMillisec, double accuracy) {
int secondsAccuracy = 133 * 1000;
accuracy = (timeTakenMillisec / secondsAccuracy) * 100;
return accuracy;
}



}