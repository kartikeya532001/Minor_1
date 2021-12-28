package Minor;

import java.util.*;
import java.io.*;

public class RegisterAndLogin {
	String username, password;
	Scanner scan = new Scanner(System.in);

	void Register() throws IOException {
		System.out.println("Create your user name: ");
		username = scan.nextLine();
		System.out.println("Create your password: ");
		password = scan.nextLine();
		String s = (username + "," + password);
		FileOutputStream fout = new FileOutputStream("./LoginDetails.txt", true);
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			fout.write(ch[i]);
		}
		fout.close();
	}

	boolean login() throws IOException {
		System.out.println("Enter user name: ");
		String inputName = scan.nextLine();
		System.out.println("Enter password: ");
		String inputPass = scan.nextLine();
		boolean decision = false;
		String inputString = (inputName + "," + inputPass);
		File f = new File("LoginDetails.txt");
		FileReader fr = null;
		fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			if (str.contains(inputString)) {
				System.out.println("Login successful");
				decision = true;
				break;
			}
		}
		if (decision == false) {
			System.out.println("Login unsuccessful");
		}
		return decision;
	}
}