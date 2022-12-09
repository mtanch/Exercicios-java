
public class arrayBidimensional_Exercicio1_c {
	public static void main(String[] args) {
		Integer[] linhaUm = new Integer[6];
		Integer[] linhaDois = new Integer[6];
		Integer[] linhaTres = new Integer[6];
		Integer[] linhaQuatro = new Integer[6];
		Integer[] linhaCinco = new Integer[6];
		Integer[] linhaSeis = new Integer[6];
		
		Integer[][] quadradoNumerico = new Integer[][] {linhaUm, linhaDois, linhaTres, linhaQuatro, linhaCinco, linhaSeis};
		
		for (int i = 0; i < quadradoNumerico.length; i++) {
			for (int j = 0; j < quadradoNumerico.length; j++) {
				quadradoNumerico[i][j] = i;
				System.out.print("[" + quadradoNumerico[i][j] + "] ");
			}
			System.out.println();
		}
	}
}
