import java.util.Scanner;
public class Ex22 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String frase = "", palavra = "";
		int contador = 0, posicao = 0;
		
		System.out.print("DIGITE UMA FRASE: ");
		frase = scanner.nextLine();
		System.out.print("DIGITE UMA PALAVRA: ");
		palavra = scanner.nextLine();
		
		while(posicao < frase.length())
		{
			posicao = frase.toLowerCase().indexOf(palavra, posicao);
			
			if(posicao > -1){
				contador++;
				posicao++;
			}else{
				break;
			}
		}
		
		System.out.println(palavra  + " ocorre " + contador + " vezes");
		//fim
	}
}

