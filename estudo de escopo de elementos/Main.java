public class Main{
	public static void main(String[] args) {
		/*Aluno a = new Aluno("Luigi", "20241209");
		CadastroAluno c = new CadastroAluno();
		c.cadastrarAluno(a);
		int qtd_alunos_no_sistema = c.qtd_alunos;
		System.out.println(qtd_alunos_no_sistema);*/
		CadastroAluno.qtd_alunos = 7;
		System.out.println(CadastroAluno.qtd_alunos);
	}
}
