

import java.util.Scanner;
public class Ex17 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase1 = "", frase2 = "", caracteres1= "", caracteres2 = "", 
			   saida1 = "", saida2 = "";
		int contador1 = 0, contador2 = 0;
		
		System.out.print("Digite a primeira frase: ");
		frase1 = scanner.nextLine();
		System.out.print("Digite a segunda frase: ");
		frase2 = scanner.nextLine();
		
		for(int i = 0; i < frase1.length(); i++)
		{
			for(char c1 = 'a'; c1 <= 'z'; c1++)
			{
				if( frase1.toLowerCase().charAt(i) == c1 ){
					caracteres1 += c1;
					//caracteres1 += saida1;
				}
			}
		}
		
		for(int i2 = 0; i2 < frase2.length(); i2++)
		{
			for(char c2 = 'a'; c2 <= 'z'; c2++)
			{
				if(frase2.toLowerCase().charAt(i2) == c2){
					caracteres2 += c2;
					//caracteres2 += saida2;
				}
			}
		}
		
		System.out.println();
		
		if(caracteres1.equals(caracteres2))
		{
			System.out.println("As frases são iguais");
		}
		else
		{
			System.out.println("As frases sao diferentes");
		}
		//fim
	}
}

