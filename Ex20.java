

import java.util.Scanner;
public class Ex20 {
	
	public static void main (String[] args) {
		/*Escreva um programa que receba uma frase, conte e imprima o número de
		palavras desta frase*/
		
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int contadorEspBranco = 0, contadorPalavras = 0;
		
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		System.out.println();
		
		for(int i = 0; i < frase.length(); i++)
		{
			if( frase.charAt(i) == ' '){
				contadorEspBranco++;
			}
		}
		contadorPalavras += contadorEspBranco + 1;
	
		System.out.println("Numero de palavras na frase: " + contadorPalavras);
		//fim
	}
}



