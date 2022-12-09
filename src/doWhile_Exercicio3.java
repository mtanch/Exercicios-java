import java.util.Scanner;

public class doWhile_Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva um número inteiro maior que zero: ");
		Integer inteiro = entrada.nextInt();
		
		int i = 0;
		
		do {
			
			Integer multiplo = i * inteiro;
			
			System.out.println((i+1) + "º - Multiplo de " + inteiro + " = " + multiplo);
		
		i++;
		
		} while (i < 10);
		entrada.close();
	}

}
//		Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number;