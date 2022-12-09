
public class lacoFor_numerosPares {
	public static void main(String[] args) {
		Integer numerosDe1Ate100 = 100;
		
		for (int i = 0; i <= numerosDe1Ate100; i++) {
			Integer moduloDeIPor2 = i % 2;
			if (moduloDeIPor2.equals(0)) {
				System.out.printf("O número %d é Par!!!\n",i);
			}
		}
		System.out.println("\n--------Fim!--------");
	}

}
