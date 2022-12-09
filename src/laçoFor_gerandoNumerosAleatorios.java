import java.util.Random;

public class laçoFor_gerandoNumerosAleatorios {
	public static void main(String[] args) {
		
		Random randomGenerator = new Random();
		for (int i = 0; i < 20; i++) {
			Integer numeroAleatorio = randomGenerator.nextInt(1000) + 1000;
			Integer modulo = numeroAleatorio % 11;
				if (modulo.equals(5)) {
					System.out.printf("O número %d tem resto 5 ao ser dividido por 11.\n", numeroAleatorio);
				}
		}
		
		
		
	}
	
//	Construa um aplicativo em Java para gerar 20 números de 1000 a 1999 e mostrar aqueles que divididos por 11 deixam resto 5.
	
}
