package aula04;

public class App {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("vivi",123456,"40002");
		System.out.println("o nome é"+aluno.getNome()); // aluno - pq é o nome da variavel q eu criei dentro da classe 
	System.out.println("a matricula é"+aluno.getMatricula()+"\n"+"o cpf é"+aluno.getCpf());

	}

}
