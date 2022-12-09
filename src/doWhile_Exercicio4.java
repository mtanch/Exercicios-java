import java.text.DecimalFormat;
import java.util.Scanner;
public class doWhile_Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat ("###,##0");
		
		System.out.println("Digite um número: ");
		Long numero = entrada.nextLong();
		Long n = numero;
		Long fatorial = numero;
		
		do {
			n--;
			System.out.println(decimal.format(fatorial) + " * " + n);
			fatorial = fatorial * n;
			
		} while (n > 1);
		System.out.println("\n" + numero + "! = " + decimal.format(fatorial));
		entrada.close();
	}
}
//		Write a program to find the factorial value of any number entered through the keyboard;