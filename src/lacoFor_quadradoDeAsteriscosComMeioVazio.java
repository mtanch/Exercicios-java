import java.util.Scanner;

public class lacoFor_quadradoDeAsteriscosComMeioVazio {
	public static void main(String[] args) {
		
		Integer tamanhoDoQuadrado, comprimentoDoQuadrado,  meioDoQuadrado;
		
		Scanner quadradoDeAsteriscosComMeioVazio = new Scanner (System.in);
		
		System.out.print("Digite o Tamanho do Quadrado: ");
		tamanhoDoQuadrado = quadradoDeAsteriscosComMeioVazio.nextInt();
		comprimentoDoQuadrado = tamanhoDoQuadrado;
		meioDoQuadrado = tamanhoDoQuadrado - 2;
		
		if (tamanhoDoQuadrado <= 20 && tamanhoDoQuadrado > 1) {
			
			for (int i = 0; i < comprimentoDoQuadrado; i++) {
				System.out.print("*"); // primeira linha do quadrado
			}		
			for (int j = 0; j < meioDoQuadrado; j++) {
				System.out.print("\n*"); // primeiro asterisco de cada linha
				for (int k = 0; k < meioDoQuadrado ; k++) {
					System.out.print(" "); // espa�o vazio dentro do quadrado
				}
				for (int l = 0; l < 1; l++) {
					System.out.print("*"); // ultimo asterisco de cada linha
				}
			}
			System.out.println();
			for (int m = 0; m < comprimentoDoQuadrado; m++) {
				System.out.print("*"); // ultima linha do quadrado
			}
		} else {
			System.out.println("\nDigite um n�mero entre 1 e 20.");
		}
		
		quadradoDeAsteriscosComMeioVazio.close();
	}
}