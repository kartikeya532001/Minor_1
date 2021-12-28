package Minor;
import java.util.*;
import java.io.*;
public class BookPreference {
	Scanner scan = new Scanner(System.in);
	KMP_Algo k1 = new KMP_Algo();
	void bookType()
	{
		System.out.println("What kind of book do you want to read: ");
		System.out.println("1 for Fiction");
		System.out.println("2 for Adventure");
		System.out.println("3 for Romantic");
		System.out.println("4 for Horror");
	}
	/*BookPreference(String bookType)
	{
		
	}*/
	void Fiction(String s) throws IOException
	{
		String fiction[] = {"Sorrow And Bliss by Meg Mason","Tanmay Kanwar by Meg Mason","Crossroads by Jonathan Franzen","Malibu Rising by Taylor Jenkins Reid","The Promise by Damon Galgut"};
        String pat = s;
        for(int i = 0 ; i < fiction.length; i++)
        
        {
            String txt = fiction[i];
            k1.KMPSearch(pat, txt);
        }
        k1.printList();
        int whichBook = scan.nextInt();		
		k1.printSpecificList(whichBook);        
	}
	void Adventure(String s) throws IOException
	{
		String Adventure[] = {"The Odyssey by Homer","Gulliver's Travels by Jonathan Swift","Moby-Dick by Herman Melville","Treasure Island by Robert Louis Stevenson","King Solomon's Mines by H. Rider Haggard"};
        String pat = s;
        for(int i = 0 ; i < 4; i++)
        
        {
            String txt = Adventure[i];
            k1.KMPSearch(pat, txt);
        }
        k1.printList();
        int whichBook = scan.nextInt();
		/*b1.Fiction();*/
		k1.printSpecificList(whichBook);
	}
	void Romantic(String s) throws IOException
	{
		String Romantic[] = {"Pride and Prejudice by Jane Austen","Outlander by Diana Gabaldon","Call Me Irresistible by Susan Elizabeth Phillips","Suddenly You by Lisa Kleypas","Jane Eyre by Charlotte Bront�"};
        String pat = s;
        for(int i = 0 ; i < 4; i++)
        
        {
            String txt = Romantic[i];
            k1.KMPSearch(pat, txt);
        }
        k1.printList();
        int whichBook = scan.nextInt();
		k1.printSpecificList(whichBook);
	}
	void Horror(String s) throws IOException
	{
		String Horror[] = {"Reprieve by James Han Mattson","A Cosmology of Monsters by Shaun Hamill","The Haunting of Hill House by Shirley Jackson","Mexican Gothic by Silvia Moreno-Garcia","Frankenstein by Mary Shelley","Fledgling by Octavia E","White is for Witching by Helen Oyeyemi"};
        String pat = s;
        for(int i = 0 ; i < 4; i++)
        
        {
            String txt = Horror[i];
            k1.KMPSearch(pat, txt);
        }
        k1.printList();
        int whichBook = scan.nextInt();
		k1.printSpecificList(whichBook);
	}
}
