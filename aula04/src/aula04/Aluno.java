package aula04;

public class Aluno {
	private String nome;
	private int matricula;
	private String cpf;
	
	//iniciando construtor
	public Aluno(String nome,int matricula,String cpf){ 
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
			
	}
	public Aluno() {} // construtor vazio para não dar erro
	
	// getters e setters (pegar e modificar)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
