import java.util.Scanner;

public class arrayTeste_1 {
	public static void main(String[] args) {
		
//		Exemplo 1: Faça um programa que peça 3 números inteiros ao usuário, armazene em um Array, depois mostre o valor de cada elemento do array, assim como seu índice.
		
		Integer[] numeros = new Integer[3];
		
		Scanner numerosInteiros = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = numerosInteiros.nextInt();
//			Integer numero = numeros[i];
//			System.out.println("Valor = " + numero + " e Índice = " + i);
		}
		System.out.println("");
		for(int i=0 ; i < numeros.length ; i++){
            System.out.printf("Número %d -> Valor armazenado: %d\n",i+1, numeros[i]);
		}
		numerosInteiros.close();
		
	}

}
