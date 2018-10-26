package input;

import java.io.Console;

public class ConsoleInput {

	public static void main(String[] args) {
		Console cons = System.console();
		char[] password = cons.readPassword();
		System.out.println("Password is " + password);
	}

}
