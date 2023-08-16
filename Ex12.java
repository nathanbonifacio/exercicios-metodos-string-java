

import java.util.Scanner;
public class Ex12 {
	
	public static void main (String[] args) {		
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "", vogais = "aeiouAEIOU";
		int contador = 0, contadorVogais = 0;
		
		System.out.print("Digite uma frase qualquer: ");
		frase = scanner.nextLine();
		
		for(int i = 0; i < frase.length(); i++)
		{
			if( vogais.contains( String.valueOf( frase.charAt(i) ) ) ){
			contadorVogais++;
			}
		}
		
		
	}
}


