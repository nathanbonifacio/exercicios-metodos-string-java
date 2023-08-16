

import java.util.Scanner;
public class Ex13 {
	
	public static void main (String[] args) {
		/*Escreva um programa que imprima o número de consoantes de uma
		frase fornecida pelo usuário*/
		
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "", vogais = "aeiouAEIOU", alfabeto = "";
		int contadorConsoantes = 0;
		
		System.out.print("Digite uma frase qualquer: ");
		frase = scanner.nextLine();
		
		for(char letra = 'a'; letra <= 'z'; letra++)
		{
			if(! vogais.contains("" + letra)){
				for(int i = 0; i < frase.length(); i++){
					if(frase.toLowerCase().charAt(i) == letra){
						alfabeto += letra;
						contadorConsoantes++;
					}
				}
			}
		}
		
	System.out.println("Consoantes: " + contadorConsoantes);
	}
}

