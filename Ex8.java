

import java.util.Scanner;
public class Ex8 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase  = "";
		int contador = 0;
		
		System.out.print("Digite uma frase: ");
		frase = scanner.nextLine();
		
		for(char letra = 'A'; letra <= 'Z'; letra++)
		{
			contador = 0;
			
			for(int i = 0; i < frase.length(); i++)
			{
				if(frase.toUpperCase().charAt(i) == letra){
					contador++;
				}
			}
				
			if(contador > 0){
				System.out.println(letra + " - " + contador);
			}
		}
		//fim do laço for
		}
	}


