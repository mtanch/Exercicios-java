
public class lacoFor_numerosImpares {
	public static void main(String[] args) {
		Integer[] numerosDe1Ate100 = new Integer[100];
		
		for (int i = 0; i < numerosDe1Ate100.length; i++) {
			Integer moduloDeIPor2 = (i % 2);
			if (!moduloDeIPor2.equals(0)) {
				System.out.printf("O n�mero %d � �mpar.\n",i);		
			}
		}
		System.out.println("\n--------Fim!--------");
		
	}

}
