import java.text.DecimalFormat;
import java.util.Scanner;
public class doWhile_Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("###,##0");
		System.out.println("---Calculo de potenciação---\n");
		
		System.out.print("Digite o número base: ");
		Long numeroBase = entrada.nextLong();
		System.out.print("Digite a potência: ");
		Long potencia = entrada.nextLong();
		int i = 0;
		
		Long resultado = numeroBase;
				
		do {
			
			Long calculo = resultado * numeroBase;
			resultado = calculo;
			i++;
			
		} while (i < (potencia-1));		
		System.out.println("\n" + decimal.format(resultado));
		entrada.close();
	}
}
//		Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use java built-in method);