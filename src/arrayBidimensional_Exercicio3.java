import java.util.Scanner;

public class arrayBidimensional_Exercicio3 {

	public static void main(String[] args) {
		
		Double[] linha1 = new Double[5];
		Double[] linha2 = new Double[5];
		Double[][] matriz = new Double[][] {linha1, linha2};
				
		Scanner matrizDoisPorCinco = new Scanner(System.in);
		
		System.out.println("Digite 10 números: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				Double entradaDeDados = matrizDoisPorCinco.nextDouble();
				matriz[i][j] = entradaDeDados;
			}
			
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%.1f]", matriz[i][j]);
			}
			System.out.println();
		}
		matrizDoisPorCinco.close();
	}

}
// escreva um trecho java que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5;

//		Projetos Proprios > random.java