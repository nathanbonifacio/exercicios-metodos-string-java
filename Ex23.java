

import java.util.Scanner;
public class Ex23 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String nomeCompleto = "", sobrenome = "";
		
		System.out.print("Digite seu nome completo: ");
		nomeCompleto = scanner.nextLine();
		
		for(int i = nomeCompleto.length()-1; i >= 0; i--)
		{
			if(nomeCompleto.charAt(i) == ' '){
				break;
			}
			sobrenome =nomeCompleto.charAt(i) + sobrenome;
		}
		
		System.out.println("Sobrenome: " + sobrenome);
	}
}

