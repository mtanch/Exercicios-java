import java.util.Scanner;
public class validacaoSenha {
		
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		String senha, letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWYXZ", letrasMinusculas = "abcdefghijklmnopqrstuvwyxz", numeros = "1234567890", caracEspec = "!@#$%&*~^<>,.ªº°";
		int qtdMaiusculas = 0, qtdMinusculas = 0, qtdNumeros = 0, qtdCaracEspec = 0;
						
		System.out.print("Digite uma senha: ");
		senha = entrada.nextLine();
		
		boolean menor8Digitos = senha.length() < 8;
		boolean maior16Digitos = senha.length() > 16;
		
		if (menor8Digitos) {
			System.err.print("A quantidade mínima de dígitos deve ser 8");
		} else if (maior16Digitos) {
			System.err.print("A quantidade máxima de dígitos deve ser 16");
		}
		
		for (int i = 0 ; i < senha.length() ; i++) {			//	Definindo a quantidade de letras maiusculas
			for (int j = 0 ; j < letrasMaiusculas.length() ; j++) {
				if (senha.charAt(i) == letrasMaiusculas.charAt(j)) {
					qtdMaiusculas++;
				}
			}
		}
		
		for (int i = 0 ; i < senha.length() ; i++) {			//	Definindo a quantidade de letras minusculas
			for (int j = 0 ; j < letrasMinusculas.length() ; j++) {
				if (senha.charAt(i) == letrasMinusculas.charAt(j)) {
					qtdMinusculas++;
				}
			}
		}
		
		for (int i = 0 ; i < senha.length() ; i++) {			//	Definindo a quantidade de numeros
			for (int j = 0 ; j < numeros.length() ; j++) {
				if (senha.charAt(i) == numeros.charAt(j)) {
					qtdNumeros++;
				}
			}
		}
		
		for (int i = 0 ; i < senha.length() ; i++) {			//	Definindo a quantidade de caracteres especiais
			for (int j = 0 ; j < caracEspec.length() ; j++) {
				if (senha.charAt(i) == caracEspec.charAt(j)) {
					qtdCaracEspec++;
				}
			}
		}
		
		if (qtdMaiusculas < 2) {
			System.err.print("Quantidade de letras maiúsculas insuficiente!"
					+ "\n\nVocê precisa adicionar no mínimo duas à senha.");
		} else if (qtdMinusculas < 2) {
			System.err.print("Quantidade de letras minúsculas insuficiente!"
					+ "\n\nVocê precisa adicionar no mínimo duas à senha.");
		} else if (qtdNumeros < 2) {
			System.err.print("Quantidade de números insuficiente!"
					+ "\n\nVocê precisa adicionar no mínimo dois à senha.");
		} else if (qtdCaracEspec < 2) {
			System.err.print("Quantidade de caracteres especiais insuficiente!"
					+ "\n\nVocê precisa adicionar no mínimo dois à senha.");
		} else {
			System.out.println("Senha aceita!");
		}
		
		entrada.close();
	}
}

//		VALIDAÇÃO DE SENHAS
//			a senha deve conter NO MÍNIMO duas letras maiusculas, duas letras minusculas, dois números e dois caracteres especiais
//				deve ter tamanho mínimo de 8 dígitos e máximo de 16 dígitos