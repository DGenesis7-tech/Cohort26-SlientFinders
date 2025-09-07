import java.util.Scanner;
public class TextSpeedConsole {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
TextSpeedTestFunctions object = new TextSpeedTestFunctions()
int select = 0;
long startTime = 0;
long endTime = 0;
String typing = "",
long timeTakenMillisec = 0;
String display = object.display(display);

while (select != 3) {
	select = object.displayMenu(select)
	
	switch (select) {
		case 1: 
		startTime = System.currentTimeMillis();
		typing = displayTest(typing);
		endTime = System.currentTimeMillis();
		if (typing == display) {
			timeTakenMillisec = endTime - startTime;
		}
		else {
			System.out.println("Input not compatible, try again!!!");
		}
		break;
		
		case 2: 
	
	}

}

}


}