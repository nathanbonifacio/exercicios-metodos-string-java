
import java.util.Scanner;
public class Ex5 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("Type a phrase: ");
		String phrase = scanner.nextLine();
		System.out.println();
		System.out.print("phrse: " + phrase);
		
		for(int i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A'){
				count++;
			}
		}
		System.out.println();
		System.out.println("There have in the phrase " + count + " a/'s");
	}
}



