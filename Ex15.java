

import java.util.Scanner;
public class Ex15 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "", caracteresNumericos = "0123456789";
		int contadorNum = 0;
		
		System.out.print("Digite uma frase: ");
		frase = scanner.nextLine();
		
		for(char i = '0'; i <= '9'; i++)
		{
			if( caracteresNumericos.contains( String.valueOf(i) ) )
			{
				for(int c = 0; c < frase.length(); c++)
				{
					if(frase.charAt(c) == i){
						contadorNum++;
					}
				}
			}
		}
		if(contadorNum > 0){
			System.out.println("Existem caracteres numericos na frase");
		}else {
			System.out.println(" Nao existem caracteres numericos na frase");
		}
		//fim 
	}
}

