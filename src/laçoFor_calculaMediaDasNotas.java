import java.util.Scanner;

public class laçoFor_calculaMediaDasNotas {
	public static void main(String[] args) {
//		Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
//		Em seguida, através de um laço for, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
//		Por fim, o programa mostra a média, aritmética, da turma.
		
		Integer quantidadeDeAlunosDaSala = 0; 
		Double notasDaTurma = 0.0;
				
		Scanner mediaDasNotasDosAlunosDeUmaTurma = new Scanner(System.in);
		
		System.out.print("Digite quantos alunos tem na Turma: ");
		quantidadeDeAlunosDaSala = mediaDasNotasDosAlunosDeUmaTurma.nextInt();

		for (int i = 0; i < quantidadeDeAlunosDaSala; i++) {
			
			System.out.printf("Digite a nota do %dº aluno: ", (i+1));
			notasDaTurma += mediaDasNotasDosAlunosDeUmaTurma.nextDouble();
			
		}
		Double mediaAritmetica = notasDaTurma/quantidadeDeAlunosDaSala;
		System.out.printf("A média das notas dos alunos desta turma é: %.1f", mediaAritmetica);
		
		mediaDasNotasDosAlunosDeUmaTurma.close();
	}

}
