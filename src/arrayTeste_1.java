import java.util.Scanner;

public class arrayTeste_1 {
	public static void main(String[] args) {
		
//		Exemplo 1: Fa�a um programa que pe�a 3 n�meros inteiros ao usu�rio, armazene em um Array, depois mostre o valor de cada elemento do array, assim como seu �ndice.
		
		Integer[] numeros = new Integer[3];
		
		Scanner numerosInteiros = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um n�mero: ");
			numeros[i] = numerosInteiros.nextInt();
//			Integer numero = numeros[i];
//			System.out.println("Valor = " + numero + " e �ndice = " + i);
		}
		System.out.println("");
		for(int i=0 ; i < numeros.length ; i++){
            System.out.printf("N�mero %d -> Valor armazenado: %d\n",i+1, numeros[i]);
		}
		numerosInteiros.close();
		
	}

}
