package cadastroAluno;

import java.util.ArrayList;

public class Aluno {
	float total = 0;
	String nome, cpf, situacao = "reprovado";
	// NotasAluno
	ArrayList<Float> notasAluno = new ArrayList<>();

	public Aluno() {
	}

	public Aluno(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// Lista de alunos(informações)
	void listar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nCPF: " + this.cpf);

		for (int i = 0; i < notasAluno.size(); i++) {
			System.out.println("Nota " + (i + 1) + ": " + this.notasAluno.get(i));
		}
	}

	// ListarSituações

	void mostraSituacao() {
		System.out.println("\nNome: "+ this.nome);
		System.out.println("\nTotal: "+ this.total);
		System.out.println("\nSituação: "+ this.situacao);
	}

	void calculaNotas() {
		for(float notaDaLista:notasAluno) {
			total += notaDaLista;
		}
		
		if (total >= 70) {
			this.situacao = "aprovado";
		}else {
			this.situacao = "reprovado";
		}
		
	}

	// notasAlunos

	void insereNotas(float nota) {
		notasAluno.add(nota);
	}

	public ArrayList<Float> getNotasAluno() {
		return notasAluno;
	}

	public void setNotasAluno(ArrayList<Float> notasAluno) {
		this.notasAluno = notasAluno;
	}

}
