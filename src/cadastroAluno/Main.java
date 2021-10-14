package cadastroAluno;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int opc, qtdNotas;
		Aluno novoAluno = new Aluno();
		float nota = 0;
		String nome, cpf;
		Sala novaSala = new Sala();

		// keyboard
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("\n-------------------");
			System.out.println("          Menu");
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Inserir aluno");
			System.out.println("2 - Listar alunos");
			System.out.println("3 - Situações");
			System.out.println("0 - Sair");
			opc = teclado.nextInt();
			// buffer
			teclado.nextLine();

			switch (opc) {
			case 1:
				// CadastroAlunos
				System.out.println("\nNome:");
				nome = teclado.nextLine();
				System.out.println("\nCPF:");
				cpf = teclado.nextLine();
				
				novoAluno = new Aluno(nome,cpf);
				
				System.out.println("Quantas Notas:");
				qtdNotas = teclado.nextInt();

				for (int i = 0; i < qtdNotas; i++) {
					System.out.println("\nNota " + (i + 1));
					nota = teclado.nextFloat();
					novoAluno.insereNotas(nota);
				}
				 novaSala.insereAluno(novoAluno);
				break;
			case 2:
				// ListarAlunos
				novaSala.listarAlunos();
				
				break;
			case 3:
				//Situacoes 
				
				novaSala.listarSituacoes();
				
				break;
			case 0:
				System.out.println("Saindo...");
				teclado.close();
				break;
			default:
				System.out.println("Erro no sistema!! \nO valor inserido é invalido!!");
			}
		} while (opc != 0);

	}
}
