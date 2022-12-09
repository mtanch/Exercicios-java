
public class arrayBidimensional_Exercicio1_a {
	public static void main(String[] args) {

		Integer[] linhaUm = new Integer[10];
		Integer[] linhaDois = new Integer[10];
		Integer[] linhaTres = new Integer[10];
		
		Integer[][] retanguloDeNumeros = new Integer[][] {linhaUm, linhaDois, linhaTres};
		
		for (int i = 0; i < retanguloDeNumeros.length; i++) {
			
			for (int j = 0; j < 10; j++) {
				retanguloDeNumeros[i][j] = j;
				System.out.print(retanguloDeNumeros[i][j]);
			}
		System.out.println();	
		}
		
	}
//		Mostrar no console três linhas com uma numeração de 0 até 9 cada.
}
