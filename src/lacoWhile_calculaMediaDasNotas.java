import java.util.Scanner;

public class lacoWhile_calculaMediaDasNotas {
	public static void main(String[] args) {
		
		Double quantidadeDosAlunosDaSala = 0.0, totalDasNotas = 0.0;
		
		int i = 0;
		
		Scanner mediaDasNotasDaSala = new Scanner(System.in);
						
		System.out.print("Quantos alunos tem na sala? ");
		quantidadeDosAlunosDaSala = mediaDasNotasDaSala.nextDouble();
		System.out.println();
		
		while (i < quantidadeDosAlunosDaSala) {
			
			System.out.printf("Digite a nota do %dº aluno ", (i+1));
			totalDasNotas += mediaDasNotasDaSala.nextDouble();
			
			i++;	
		}

//		for (int i = 0; i < quantidadeDosAlunosDaSala; i++) {
//			System.out.printf("Digite a nota do %dº aluno ", (i+1));
//			totalDasNotas += mediaDasNotasDaSala.nextDouble();
//			
//		}
		System.out.println();
		Double media = (totalDasNotas/quantidadeDosAlunosDaSala);
		System.out.printf("A média das notas da sala é: %.1f", media);
		
		mediaDasNotasDaSala.close();
	}

}
