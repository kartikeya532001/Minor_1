package Minor;

import java.util.Scanner;

public class BankVerifier {
	Scanner scan = new Scanner(System.in);
	void BankVerifier() {
		System.out.println("Enter account number: ");
		int accountNumber = scan.nextInt();
		System.out.println("Enter pin");
		int pin = scan.nextInt();
	}
}
