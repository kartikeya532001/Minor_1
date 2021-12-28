package Minor;

import java.util.*;
import java.io.*;

public class KMP_Algo {
	ArrayList<String> foundString = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);

	void KMPSearch(String pat, String txt) {
		int M = pat.length();
		int N = txt.length();

		int lps[] = new int[M];
		int j = 0;
		computeLPSArray(pat, M, lps);

		int i = 0;
		while (i < N) {
			if (pat.charAt(j) == txt.charAt(i)) {
				j++;
				i++;
			}
			if (j == M) {
				// System.out.println(txt);
				foundString.add(txt);
				j = lps[j - 1];
			}

			else if (i < N && pat.charAt(j) != txt.charAt(i)) {

				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
	}

	void printList() {
		int l;
		// System.out.println(foundString.size());
		for (int k = 0; k < foundString.size(); k++) {
			l = k + 1;
			System.out.println(l + " " + foundString.get(k));
		}
	}

	void printSpecificList(int whichBook) throws IOException {
		int index = whichBook - 1;
		System.out.println("Index: " + index);
		System.out.println("Do you want to buy " + foundString.get(index) + " ?");
		System.out.println("1 for yes");
		System.out.println("2 for no");
		System.out.println("3 for cancel order");
		int buyBook = scan.nextInt();
		switch (buyBook) {
		case 1: {
			PlaceOrder(foundString.get(index));
			break;
		}
		case 2: {
			break;
		}
		case 3: {
			System.out.println("Order calcelled!!!");
			System.exit(0);
		}
		default: {
			System.out.println("Invalid input");
		}
		}
	}

	void PlaceOrder(String s) throws IOException {
		int amount = 1000;
		System.out.println("Preparing Order... ");
		System.out.println("Book Name: " + s);
		System.out.println("Cost: Rs" + amount);
		System.out.println("Choose the mode of payment: ");
		System.out.println("1 for cash on delivery");
		System.out.println("2 for cancel order");
		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
			System.out.print("Enter your name: ");
			String name = scan.nextLine();
			scan.next();
			System.out.print("Enter your address: ");
			String address = scan.nextLine();
			scan.next();
			System.out.print("Enter your contack number: ");
			String contactNumber = scan.nextLine();
			System.out.println();
			System.out.println("ORDER CONFIRMED");
			System.out.println("Order details: ");
			System.out.println("Book name: " + s);
			System.out.println("Total amount to pay: " + amount);
			System.out.println("Customer Name: " + name);
			System.out.println("Address: " + address);
			System.out.println("Contact number: " + contactNumber);
			System.out.println("Mode of payment: Cash on delivery");
			System.out.println("Delivery time within 1 to 2 weeks");
			// Address();

			String personalInfo = (name + "," + address + "," + contactNumber);
			FileOutputStream fout = new FileOutputStream("./PersonalInfo.txt", true);
			char ch[] = personalInfo.toCharArray();
			for (int i = 0; i < personalInfo.length(); i++) {
				fout.write(ch[i]);
			}
			fout.close();
			break;
		}
		case 2: {
			System.out.println("ORDER CANCELLED!!!");
			System.exit(0);
			break;
		}
		default: {
			System.out.println("Invalid input");
		}
		}
	}

	void computeLPSArray(String pat, int M, int lps[]) {

		int len = 0;
		int i = 1;
		lps[0] = 0;

		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {

				if (len != 0) {
					len = lps[len - 1];

				} else {
					lps[i] = len;
					i++;
				}
			}
		}
	}
}