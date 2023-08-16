
import java.util.Scanner;
public class Ex21 {
	
	public static void main (String[] args) {
		/*Nathan Henrque Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "", palavra = "";
		int fimPalavra;
		
		System.out.print("Digite uma frase: ");
		frase = scanner.nextLine();
		System.out.println();
		
		for(int inicioPalavra = 0; inicioPalavra < frase.length();)
		{
			//declara o 'fim' desde a primeira letra até o espaço em branco ' '
			fimPalavra = frase.indexOf(' ', inicioPalavra);
			
			//essa condição pega e espaço em branco e retira-o com esse -1, deixando só a palavra escrita
			if(fimPalavra == -1)
			{
				fimPalavra = frase.length();
			}
			
			// declara a variavel 'palavra' como uma substring da frase desde a primeira letra até a ultima letra da palavra 
			//(sem contar o espaço em branco)
			palavra = frase.substring(inicioPalavra, fimPalavra);
			
			System.out.println(palavra); //exibe as palavras
			
			//utilizado para ir para a próxima palavra, e o "+ 1" é usado para pular espaços em branco
			inicioPalavra = fimPalavra + 1;
		}
		
	}
}
