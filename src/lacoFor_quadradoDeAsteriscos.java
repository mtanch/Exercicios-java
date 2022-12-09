import java.util.Scanner;

public class lacoFor_quadradoDeAsteriscos {
	public static void main(String[] args) {
		
		Integer tamanhoDoQuadrado;
		Scanner quadradoDeAsteriscos = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do quadrado: ");
		tamanhoDoQuadrado = quadradoDeAsteriscos.nextInt();
		Integer comprimentoDoQuadrado = tamanhoDoQuadrado - 1;
		
		for (int i = 0; i < tamanhoDoQuadrado; i++) {
			
			if (tamanhoDoQuadrado > 20) {
				System.out.println("Digite um número entre 1 e 20.");
				break;
			}
			
			System.out.print("\n*");
			
			for (int j = 0; j < comprimentoDoQuadrado; j++) {
				System.out.print("*");
			}
			
		}
		quadradoDeAsteriscos.close();
	}

}

//Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos. 
//Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.