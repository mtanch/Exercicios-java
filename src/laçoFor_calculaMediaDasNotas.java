import java.util.Scanner;

public class la�oFor_calculaMediaDasNotas {
	public static void main(String[] args) {
//		Escreva um programa que pergunte ao usu�rio quantos alunos tem na sala dele.
//		Em seguida, atrav�s de um la�o for, pede ao usu�rio para que entre com as notas de todos os alunos da sala, um por vez.
//		Por fim, o programa mostra a m�dia, aritm�tica, da turma.
		
		Integer quantidadeDeAlunosDaSala = 0; 
		Double notasDaTurma = 0.0;
				
		Scanner mediaDasNotasDosAlunosDeUmaTurma = new Scanner(System.in);
		
		System.out.print("Digite quantos alunos tem na Turma: ");
		quantidadeDeAlunosDaSala = mediaDasNotasDosAlunosDeUmaTurma.nextInt();

		for (int i = 0; i < quantidadeDeAlunosDaSala; i++) {
			
			System.out.printf("Digite a nota do %d� aluno: ", (i+1));
			notasDaTurma += mediaDasNotasDosAlunosDeUmaTurma.nextDouble();
			
		}
		Double mediaAritmetica = notasDaTurma/quantidadeDeAlunosDaSala;
		System.out.printf("A m�dia das notas dos alunos desta turma �: %.1f", mediaAritmetica);
		
		mediaDasNotasDosAlunosDeUmaTurma.close();
	}

}
