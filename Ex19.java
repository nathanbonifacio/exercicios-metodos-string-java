

import java.util.Scanner;
public class Ex19 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String palavra = "", palavraInvertida = "";
		
		System.out.print("DIGITE UMA PALAVRA: ");
		palavra = scanner.nextLine();
		
		//conta a posiçaõ das palavras
		for(int i = 0; i < palavra.length(); i++)
		{
			//pega cada caractere e vai somando do primeiro com o vazio,
			//depois pega o caractere somado e soma com um novo, e isso até o final da palavra
			palavraInvertida = palavra.charAt(i) + palavraInvertida;
			
			//System.out.println(palavraInvertida); --> demonstra como é feito o processo acima
		}
		System.out.println();
		//verifica se a palavra original é igual a palavra invertida
		if( palavra.equals(palavraInvertida) )
		{
			System.out.println(palavra + " EH UM PALINDROMO!!!");
		}
		else
		{
			System.out.println(palavra + " NAO EH UM PALINDROMO");
		}
		//fim
		
		
	}
}

