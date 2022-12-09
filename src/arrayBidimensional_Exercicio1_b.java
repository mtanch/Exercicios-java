
public class arrayBidimensional_Exercicio1_b {
	public static void main(String[] args) {
		
		Integer[] linhaUm = new Integer[10];
		Integer[] linhaDois = new Integer[10];
		Integer[] linhaTres = new Integer[10];
		Integer[] linhaQuatro = new Integer[10];
		
		Integer[][] retanguloDeQuadradosPerfeitos = new Integer[][] {linhaUm, linhaDois, linhaTres, linhaQuatro};
		
		for (int i = 0; i < retanguloDeQuadradosPerfeitos.length; i++) {
			
			for (int j = 0; j < 10; j++) {
				Integer calculoQuadradoPerfeito = j*j;
				retanguloDeQuadradosPerfeitos[i][j] = calculoQuadradoPerfeito;
				System.out.print("[" + retanguloDeQuadradosPerfeitos[i][j] + "] ");
			}
			System.out.println();
		}
	}
}
// Mostrar no console quatro linhas todos os números considerados Quadrados Perfeitos até 99.