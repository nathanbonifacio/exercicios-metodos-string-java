

import java.util.Scanner;
public class Ex6 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		
		System.out.print("Digite uma frase: ");
		frase = scanner.nextLine();
		System.out.println();
		System.out.print("Informe um caractere: ");
		char caractere = scanner.next().charAt(0);
		
		for(int i = 0; i < frase.length(); i++)
		{
			if(frase.toLowerCase().charAt(i) == caractere)
			{
				contador++;
			}
		}
		System.out.println();
		System.out.println("A quantidade de " + caractere + "'s que aparece na frase eh " + contador);
	}
}

