
public class arrayBidimensional_Exercicio1_d {
	public static void main(String[] args) {
		
		Integer[] linha1 = new Integer[6];
		Integer[] linha2 = new Integer[6];
		Integer[] linha3 = new Integer[6];
		Integer[] linha4 = new Integer[6];
		Integer[] linha5 = new Integer[6];
		Integer[] linha6 = new Integer[6];
		Integer[] linha7 = new Integer[6];
		Integer[] linha8 = new Integer[6];
		Integer[] linha9 = new Integer[6];
		
		Integer[][] paralelepipedo = new Integer[][] {linha1, linha2, linha3, linha4, linha5, linha6, linha7, linha8, linha9};
		
		Integer menosUm = -1;
		Integer zero = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 6; j++) {
				Boolean par = i % 2 == 0;
				
				if (par) {
					paralelepipedo[i][j] = menosUm;
					System.out.print("[" + paralelepipedo[i][j] + "]");
				} else {
					paralelepipedo[i][j] = zero;
					System.out.print("[ " + paralelepipedo[i][j] + "]");
				}
			}
			System.out.println();
		}
	}
}
