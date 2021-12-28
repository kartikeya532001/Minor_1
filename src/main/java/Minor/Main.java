package Minor;
import java.util.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		KMP_Algo K1 = new KMP_Algo();
		int whichBook;
		Fristpage obj = new Fristpage();
		obj.fristpage();
		RegisterAndLogin obj1 = new RegisterAndLogin();
		System.out.println("Press 1 for login");
		System.out.println("Press 2 for register");
		int choice = scan.nextInt();
		while(choice != 7) {
			switch (choice) {
			case 1: {
				boolean dec = obj1.login();
				if(dec)
				{
					BookPreference b1 = new BookPreference();
					b1.bookType();
					int books = scan.nextInt();
					switch(books)
					{
					case 1: {
						System.out.println("Search book or author name: ");
						String r = scan.nextLine();
						String s = scan.nextLine();
						System.out.println();
						System.out.println("Which of the following Fiction book do you want to buy: ");
						b1.Fiction(s);
						System.out.println();
						//whichBook = scan.nextInt();
						/*b1.Fiction();*/
						//K1.printSpecificList(whichBook);
						break;
						}
					case 2: {
						System.out.println("Search book or author name: ");
						String r = scan.nextLine();
						String s = scan.nextLine();
						System.out.println();
						System.out.println("Which of the following Adventure book do you want to buy: ");
						b1.Adventure(s);
						System.out.println();
						/*whichBook = scan.nextInt();
						b1.BuyBook(whichBook);
						K1.printSpecificList(whichBook);*/
						break;
						}
					case 3: {
						System.out.println("Search book or author name: ");
						String r = scan.nextLine();
						String s = scan.nextLine();
						System.out.println();
						System.out.println("Which of the following Romantic book do you want to buy: ");
						b1.Romantic(s);
						System.out.println();
						/*whichBook = scan.nextInt();
						b1.BuyBook(whichBook);
						K1.printSpecificList(whichBook);*/
						break;
						}
					case 4: {
						System.out.println("Search book or author name: ");
						String r = scan.nextLine();
						String s = scan.nextLine();
						System.out.println();
						System.out.println("Which of the following Horror book do you want to buy: ");
						b1.Horror(s);
						System.out.println();
						/*whichBook = scan.nextInt();
						b1.BuyBook(whichBook);
						K1.printSpecificList(whichBook);*/
						break;
						}
					default: {
						System.out.println("Invalid input");		
						}
					}
				}
				if(!dec){
					System.out.println("Invalid Credentials Retry");
				}
				break;
			}
			case 2: {
				obj1.Register();
				break;
				}
			case 7: {
				break;
				}
			default: {
				System.out.println("Invalid input");
				}
			}
		}
	}
}