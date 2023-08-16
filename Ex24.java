

import java.util.Scanner;
public class Ex24 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String sequencia = "", seqUm = "";
		int tamanho = 0, maiorTamanho = 0;
		
		System.out.print("Digite uma sequencia de 0 e 1: ");
		sequencia = scanner.nextLine();
		
		for(int i = 0; i < sequencia.length(); i++)
		{
			if(sequencia.charAt(i) == '1'){
				tamanho++;
			} else {
				tamanho = 0;
			}
			
			if(tamanho > maiorTamanho){
				maiorTamanho = tamanho;
			}
		}
		System.out.println(maiorTamanho);
	}
}

