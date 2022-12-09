import java.util.Random;

public class arrayBidimensional_Exercicio2 {

	public static void main(String[] args) {
		
		Integer[] matriz1 = new Integer[10];
		Integer[] matriz2 = new Integer[10];
		Integer[] matriz3 = new Integer[10];
		Integer[] matriz4 = new Integer[10];
		Integer[] matriz5 = new Integer[10];
		
		Integer[][] bidimensional = new Integer[][] {matriz1, matriz2, matriz3, matriz4, matriz5};
		
		Random gerador = new Random();
		
		for (int i = 0; i < bidimensional.length; i++) {		
			for (int j = 0; j < bidimensional[i].length; j++) {
				Integer aleatorio = gerador.nextInt(100);
				bidimensional[i][j] = aleatorio;
				System.out.print("[" + bidimensional[i][j] + "]");
			}
			System.out.println();
		}
		
	}

}
// preencha uma matriz de inteiros com números aleatórios positivos menores que 100