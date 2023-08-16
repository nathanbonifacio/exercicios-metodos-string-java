
import java.util.Scanner;
public class Ex10 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "";
		int contMaiusculos = 0;
		
		System.out.print("Digite uma frase: ");
		frase = scanner.nextLine();
		
		for(char letra = 'A'; letra <= 'Z'; letra++)
		{
			for(int i = 0; i < frase.length(); i++)
			{
				if(frase.charAt(i) == letra){
					contMaiusculos++;
				}
			}
		}
		System.out.println("A quantidade total de letras maisculas eh " + contMaiusculos);
	}
}

