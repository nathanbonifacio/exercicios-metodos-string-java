

import java.util.Scanner;
public class StringEx29 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		Scanner leiaString = new Scanner(System.in);
		
		boolean repeat = true;
		String frase = "", zenit = "ZENITPOLAR", polar = "POLARZENIT", cripto = "";
			
		while(repeat == true)
		{
			System.out.println("Escolha uma opcao abaixo: ");
			System.out.println("1 – Criptografar");
			System.out.println("2 – Descriptografar");
			System.out.println("3 – Sair");
			int op = scanner.nextInt();
			System.out.println();
			
			if(op == 3)
			{
				System.out.println("Finalizado o Programa");
				break;
			}
			else if(op == 1)
			{
				//criptografar
				System.out.print("Digite uma frase qualquer: ");
				frase = leiaString.nextLine().toUpperCase();
				
				for(int i = 0; i < frase.length(); i++)
				{
					if(zenit.contains("" + (frase.charAt(i))))
					{
						for(int j = 0; j < zenit.length(); j++){
							if(zenit.charAt(j) == frase.charAt(i)){
								cripto += polar.charAt(j);
								break;
							}
						}
					}
					else
					{
						cripto += frase.charAt(i);
					}
				}
				System.out.println("FRASE CRIPTOGRAFADA: " + cripto);			
			}
			else if(op == 2)
			{
				//descriptografia
				System.out.print("Digite uma frase qualquer: ");
				frase = leiaString.nextLine().toUpperCase();
				
				for(int i = 0; i < frase.length(); i++)
				{
					if(zenit.contains("" + (frase.charAt(i))))
					{
						for(int j = 0; j < zenit.length(); j++){
							if(zenit.charAt(j) == frase.charAt(i)){
								cripto += polar.charAt(j);
								break;
							}
						}
					}
					else
					{
						cripto += frase.charAt(i);
					}
				}
				System.out.println("FRASE CRIPTOGRAFADA: " + cripto);			
			}
			else
			{
				System.out.println("Opcao Invalida! Tente Novamente");
			}
			
		} //fim do while
	}
}

