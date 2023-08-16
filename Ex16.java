

import java.util.Scanner;
public class Ex16 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "";
		int maiusculo = 0;
		
		System.out.print("Digite uma frase: ");
		frase = scanner.nextLine();
		
		for(char i = 'A'; i <= 'Z'; i++)
		{
			for(int c = 0; c < frase.length(); c++)
			{
				if(frase.charAt(c) == i){
					maiusculo++;
				}
			}
		}
		
		if(maiusculo == frase.length()){
			System.out.println("Todos os caracteres sao maisuculos");
		} else{
			System.out.println("nem todos os caracteres sao maisuculos");
		}
	}
}

