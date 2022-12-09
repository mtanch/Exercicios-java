import java.util.Scanner;

public class laçoFor_encontrandoONumeroMaior {
	public static void main(String[] args) {
		Scanner encontrandoOMaiorNumero = new Scanner (System.in);
		Integer maiorNumero = 0, numeroAtual;
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", (i+1));
			numeroAtual = encontrandoOMaiorNumero.nextInt();
			
			if (maiorNumero < numeroAtual) {
				maiorNumero = numeroAtual;
			}
			
		}
		System.out.println("");
		System.out.printf("O número [%d] é o maior dentre os outros números.", maiorNumero);
		
		encontrandoOMaiorNumero.close();
	}

}
//Escreva um programa em Java que solicita 10 números ao usuário, através de um laço for, e ao final mostre qual destes números é o maior.

//Integer maiorNumero = 0, numeroAtual;
//int i = 0;
//Scanner encontrandoOMaiorNumero = new Scanner(System.in);

//while(i < 10){
//
//	System.out.printf("Informe o %dº número: ", (i+1));
//	numeroAtual = encontrandoOMaiorNumero.nextInt();
//
//	if (numeroAtual > maiorNumero){
//		maiorNumero = numeroAtual;
//	}
//
//i++;
//}
//System.out.println();
//System.out.printf("O maior número é: %d", maiorNumero);
//encontrandoOMaiorNumero.close();