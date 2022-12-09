import java.util.Scanner;

public class lacoFor_encontrandoOsDoisMaioresNumeros {
	public static void main(String[] args) {
		Integer[] sequencia = new Integer[10];
		Integer maiorNumero = 0, segundoMaiorNumero = 0;
		
		Scanner encontrandoOsDoisMaioresNumeros = new Scanner (System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d� n�mero: ", (i+1));
			sequencia[i] = encontrandoOsDoisMaioresNumeros.nextInt();
			if (maiorNumero < sequencia[i]) {
				segundoMaiorNumero = maiorNumero;
				maiorNumero = sequencia[i];
			}
			
		}
		
		System.out.printf("\nO Maior N�mero �: [%d]\nO Segundo Maior �: [%d]", maiorNumero, segundoMaiorNumero);
//		System.out.printf("Sequencia 7 = %d\n", sequencia[7]);
//		System.out.printf("Sequencia 9 = %d", sequencia[9]);
		encontrandoOsDoisMaioresNumeros.close();
	}

}
//Escreva um programa em Java que solicita 10 n�meros ao usu�rio atrav�s de um la�o for, e ao final mostre os dois maiores n�meros digitados pelo usu�rio.
