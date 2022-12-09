
public class doWhile_Exercicio2 {

	public static void main(String[] args) {
		
		int i = 2;
		Integer soma = 1;
		do {
			System.out.printf("%d + %d\n", soma, i);
			soma = soma + i;
			
			i++;
			
		} while (i <= 10);
		System.out.println("\nA soma dos números é: " + soma);
	}

}
//		Write a program to calculate the sum of first 10 natural number.