
import java.util.Scanner;
public class Ex9 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int contadorEspacosEmBranco = 0;
		
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		for(int i = 0; i < frase.length(); i++)
		{
			if(frase.charAt(i) == ' '){
				contadorEspacosEmBranco++;
			}
		}
		System.out.println("ESPACOS EM BRANCO = " + contadorEspacosEmBranco);
	}
}

