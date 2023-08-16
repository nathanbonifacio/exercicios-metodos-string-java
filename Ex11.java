import java.util.Scanner;
public class Ex11 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "";
		int contCaracteres = 0, contNumeros = 0;
		
		System.out.print("Escreva uma frase qualquer: ");
		frase = scanner.nextLine();
		System.out.println();
		
		for(int i = 0; i < frase.length(); i++)
		{
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z' || frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
				contCaracteres++;
			}
			
			if(frase.charAt(i) >= '0' && frase.charAt(i) <= '9'){
				contNumeros++;
			}
		}
		System.out.println("Quantidade de caracteres alfabeticos: " + contCaracteres);
		System.out.println("Quantidade de caracteres numericos: " + contNumeros);
	}
}

