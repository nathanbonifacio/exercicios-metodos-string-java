

import java.util.Scanner;
public class Ex25 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		String senha = "", caracteresEspeciais = "!@#$%&*()+";
		int contCaracteres = 0, contMinusculas = 0, contMaiusculas = 0, contNumeros = 0;
		boolean repeat = true;
		
		while(repeat == true)
		{
			System.out.print("Crie uma senha forte: ");
			senha = scanner.nextLine();
			
			for(int i = 0; i < senha.length(); i++)
			{
				if( (senha.charAt(i) >= 'A') && (senha.charAt(i) <= 'Z') ){
					contMaiusculas++;
				}
				
				if( (senha.charAt(i) >= 'a') && (senha.charAt(i) <= 'z') ){
					contMinusculas++;
				}
				
				if( (senha.charAt(i) >= '0') && (senha.charAt(i) <= '9') ){
					contNumeros++;
				}
				
				for(int c = 0; c < caracteresEspeciais.length(); c++)
				{
					if(senha.charAt(i) == caracteresEspeciais.charAt(c)){
						contCaracteres++;
					}
				} //fim do 2º laço for	
			} //fim do 1º laço for
		System.out.println();
		
		System.out.println("REGRAS");
		System.out.println("Tamanho 10: " + senha.length() + ((senha.length() >= 10) ? "(OK)" : "(X)") );
		System.out.println("Letras 3: " + (contMaiusculas + contMinusculas) + ( ( (contMaiusculas + contMinusculas) >= 3) ? "(OK)" : "(X)") );
		System.out.println("Letras Maiusculas: " + contMaiusculas + ((contMaiusculas >= 1) ? "(OK)" : "(X)"));
		System.out.println("Letras Minusculas: " + contMinusculas + ((contMinusculas >= 1) ? "(OK)" : "(X)"));
		System.out.println("Numeros 3: " + contNumeros + ((contNumeros >= 3) ? "(OK)" : "(X)") );
		System.out.println("Simbolos 2: " + contCaracteres + ((contCaracteres >= 2) ? "(OK)" : "(X)") );
		
		if( (senha.length() >= 10) && ((contMaiusculas + contMinusculas) >= 3) && (contMaiusculas >= 1) && (contMinusculas >= 1) && (contNumeros >= 3) && (contCaracteres >= 2) )
		{
			System.out.println();
			System.out.println("Senha Aprovada! Parabens! ");
			break;
		}
		else
		{
			System.out.println();
			System.out.println("Senha Reprovada! Tente Novamente! ");
		}
		
		} //fim do laço while
		
	}
}

