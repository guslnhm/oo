public class Main{
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gustavo", 20010416, "gustavo@unb.br");
		Turma t1 = new Turma(20);
		t1.setDisciplina("ORIENTACAO A OBJETOS");
		t1.setCodigo(158);
		t1.matricularAluno(a1);
		Aluno a2;
		a2 = t1.pesquisarAluno(20010416);
		//System.out.println(a2); //imprime a referência
	}
}
