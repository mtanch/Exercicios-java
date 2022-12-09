import java.util.Scanner;
public class doWhile_Exercicio6 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        Long numero = entrada.nextLong();
    	System.out.println();
    	Long resultado = numero;
        Long invertido = 0L;
    	
//        do {
//        	invertido *= 10;
//        	invertido += (numero % 10);
//        	numero /= 10;
//        } while (numero != 0);
//        System.out.println(invertido);
        
        do {
        	System.out.println("invertido = " + invertido + " * 10 => " + (invertido *= 10));
        	System.out.println("invertido = " + invertido + " + (" + resultado + " % 10) => " + (invertido += (resultado % 10)));
        	System.out.println("numero = " + resultado + " / 10 => " + (resultado /= 10));
        	
        	if (resultado != 0) {
				System.out.println("\n[CONTINUA]\n");
			} else {
				System.out.println("\n[FIM]\n");
			}
        	
		} while (resultado != 0);
        
		System.out.println("O inverso de [" + numero + "] é : [" + invertido + "]");
        
		entrada.close();
	}
}
