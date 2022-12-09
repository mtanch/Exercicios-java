import java.util.Scanner;

public class lacoFor_encontrandoONumeroMaior {
	public static void main(String[] args) {
		Scanner encontrandoOMaiorNumero = new Scanner (System.in);
		Integer maiorNumero = 0, numeroAtual;
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d� n�mero: ", (i+1));
			numeroAtual = encontrandoOMaiorNumero.nextInt();
			
			if (maiorNumero < numeroAtual) {
				maiorNumero = numeroAtual;
			}
			
		}
		System.out.println("");
		System.out.printf("O n�mero [%d] � o maior dentre os outros n�meros.", maiorNumero);
		
		encontrandoOMaiorNumero.close();
	}

}
//Escreva um programa em Java que solicita 10 n�meros ao usu�rio, atrav�s de um la�o for, e ao final mostre qual destes n�meros � o maior.

//Integer maiorNumero = 0, numeroAtual;
//int i = 0;
//Scanner encontrandoOMaiorNumero = new Scanner(System.in);

//while(i < 10){
//
//	System.out.printf("Informe o %d� n�mero: ", (i+1));
//	numeroAtual = encontrandoOMaiorNumero.nextInt();
//
//	if (numeroAtual > maiorNumero){
//		maiorNumero = numeroAtual;
//	}
//
//i++;
//}
//System.out.println();
//System.out.printf("O maior n�mero �: %d", maiorNumero);
//encontrandoOMaiorNumero.close();