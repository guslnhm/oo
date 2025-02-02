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
		
		Turma t2 = new Turma(1); //originalmente 45
		t2.setDisciplina("ALGORITMO E PROGRAMACAO DE COMPUTADORES");
		t2.setCodigo(146);
		Turma.listar_turmas();
		
		Turma.remover_turma(t1);
		Turma.listar_turmas();
		
		Turma.buscar_turma(177);
		Turma.buscar_turma(146);
		
		System.out.println("-------------------------------------");
		
		System.out.println(t2.getTotalVagas());
		t2.matricularAluno(a1);
		System.out.println(t2.getVagasDisponiveis());
		
		Aluno a3 = new Aluno("Mel", 20221105, "mel@unb.br");
		t2.matricularAluno(a3);
	}
}