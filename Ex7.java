

import java.util.Scanner;
public class Ex7 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		for(char letra = 'a'; letra <= 'z'; letra++)
		{
			contador = 0;
			
			for(int i = 0; i < frase.length(); i++)
			{
				if(frase.toLowerCase().charAt(i) == letra)
				{
					contador++;
				}
			}
			System.out.println(letra + " - " + contador);
		}
	}
}

