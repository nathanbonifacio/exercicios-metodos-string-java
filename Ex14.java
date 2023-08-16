

import java.util.Scanner;
public class Ex14 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "", caractere = "", letras = "", saida = "";
		
		System.out.print("Digite uma frase qualquer: ");
		frase = scanner.nextLine();
		
		System.out.print("Digite uma caractere qualquer: ");
		caractere = scanner.nextLine().toLowerCase();
		
		/*for(int i = 0; i < frase.length(); i++)
		{
			if( frase.toLowerCase().substring(i, i+1).equals(caractere) ){
				saida = saida + "*";
			} else{
				saida = saida + frase.charAt(i);
			}
		}*/
		//--------------------------------------------------------------
		for(int c = 0; c < caractere.length(); c++)
		{
			letras += "*";
		}
		saida = frase.replace(caractere, letras);
		
		//--------------------------------------------------------------
		
		/*for(int i = 0; i < frase.length(); i++)
		{
			if( String.valueOf( frase.toLowerCase().charAt(i) ).equals(caractere) ){
				saida += "*";
			} else{
				saida = saida + frase.charAt(i);
			}
		}*/
		
		//--------------------------------------------------------------
			
		//saida += frase.replace(caractere, "*");
		
		//--------------------------------------------------------------
		
		/*for(int i = 0; i < frase.length(); i++)
		{
			if(frase.toLowerCase().charAt(i) == caractere.toLowerCase().charAt(0)){
				saida += "*";
			} else {
				saida += frase.charAt(i);
			}
		}*/
		
		System.out.println("Saida: " + saida);
	}
}

