import java.util.Scanner;

public class laçoWhile_musicaDosPatinhos {
	public static void main(String[] args) {
		
		Scanner patinhosDaPata = new Scanner(System.in);
		
		System.out.print("Digite quantos patinhos tem na história: ");
		Integer quantidadeDePatinhos = patinhosDaPata.nextInt();
		System.out.println();
		int i = quantidadeDePatinhos;
		
		while (i > 0) {
			
			if (i > 2) {
				System.out.println(i + " patinhos foram passear\nAlém das montanhas\nPara brincar\nA mamãe gritou: "
						+ "Quá, quá, quá, quá\nMas só " + (i-1) + " patinhos voltaram de lá.\n-------------------------");
			} else if (i == 2) {
				System.out.println(i + " patinhos foram passear\nAlém das montanhas\nPara brincar\nA mamãe gritou: "
						+ "Quá, quá, quá, quá\nMas só " + (i-1) + " patinho voltou de lá.\n-------------------------");
			} else if (i == 1) {
				System.out.println(i + " patinho foi passear\nAlém das montanhas\nPara brincar\nA mamãe gritou: "
						+ "Quá, quá, quá, quá\nMas nenhum patinho voltou de lá.\n-------------------------");
			}
		i--;
		}
		
		System.out.println("A mamãe patinha foi procurar\nAlém das montanhas\nNa beira do mar\nA mamãe gritou: "
				+ "Quá, quá, quá, quá\nE os " + quantidadeDePatinhos + " patinhos voltaram de lá.\n\nFim!");
		
		patinhosDaPata.close();
	}

}
