import java.util.Scanner;

public class lacoWhile_musicaDosPatinhos {
	public static void main(String[] args) {
		
		Scanner patinhosDaPata = new Scanner(System.in);
		
		System.out.print("Digite quantos patinhos tem na hist�ria: ");
		Integer quantidadeDePatinhos = patinhosDaPata.nextInt();
		System.out.println();
		int i = quantidadeDePatinhos;
		
		while (i > 0) {
			
			if (i > 2) {
				System.out.println(i + " patinhos foram passear\nAl�m das montanhas\nPara brincar\nA mam�e gritou: "
						+ "Qu�, qu�, qu�, qu�\nMas s� " + (i-1) + " patinhos voltaram de l�.\n-------------------------");
			} else if (i == 2) {
				System.out.println(i + " patinhos foram passear\nAl�m das montanhas\nPara brincar\nA mam�e gritou: "
						+ "Qu�, qu�, qu�, qu�\nMas s� " + (i-1) + " patinho voltou de l�.\n-------------------------");
			} else if (i == 1) {
				System.out.println(i + " patinho foi passear\nAl�m das montanhas\nPara brincar\nA mam�e gritou: "
						+ "Qu�, qu�, qu�, qu�\nMas nenhum patinho voltou de l�.\n-------------------------");
			}
		i--;
		}
		
		System.out.println("A mam�e patinha foi procurar\nAl�m das montanhas\nNa beira do mar\nA mam�e gritou: "
				+ "Qu�, qu�, qu�, qu�\nE os " + quantidadeDePatinhos + " patinhos voltaram de l�.\n\nFim!");
		
		patinhosDaPata.close();
	}

}
