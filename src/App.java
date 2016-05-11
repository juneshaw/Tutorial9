import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a command.");
		String command = input.nextLine();

		switch (command) {
		case "start":
			System.out.println("Machine started");
			break;
		case "stop":
			System.out.println("Machine stopped");
			break;
		default:
			System.out.println("Command not recognized");
		};
		
		input.close();
	}

}
