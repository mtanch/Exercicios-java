import java.util.Scanner;

public class arrayTeste_2 {
	
	public static void main(String[] args) {
//		Faça um aplicativo que peça o nome do aluno, receba duas notas e depois retorne todas essas informações junto com a média dele.
		Integer[] notasDoAluno = new Integer[2];
 		Scanner nomeENotaAluno = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nomeDoAluno = nomeENotaAluno.nextLine();
		
		for (int i = 0; i < notasDoAluno.length; i++) {
			System.out.println("Digite a " + (i+1) + "ª nota do aluno: ");
			notasDoAluno[i] = nomeENotaAluno.nextInt();
			
		}
		System.out.println();
		for (int i = 0; i < notasDoAluno.length; i++) {
			System.out.printf("Nota %d = %d\n",i+1,notasDoAluno[i]);
		}
		System.out.println("\nO aluno " + nomeDoAluno + " tem " + ((notasDoAluno[0] + notasDoAluno[1]) / 2) + " pontos de média.");
		nomeENotaAluno.close();
		
	}

}
