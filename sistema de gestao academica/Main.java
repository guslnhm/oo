public class Main{
	public static void main(String[] args) {
		Universidade u = new Universidade();
		Curso c = new Curso("Biologia", "390h", "Diurno");
		u.criarCurso(c);
		//System.out.println(u.cursos.size());
		Aluno a = new Aluno("Gustavo", "231036800", "gustavo@unb.br", c);
		c.cadastrarAluno(a);
		Disciplina d = new Disciplina("INTRODUCAO A GENETICA", "IB0125", "60h", "Pagliacci");
		Disciplina d1 = new Disciplina("INTRODUCAO A CITOLOGIA", "IB0234", "60h", "Yves Saint-Laurent");
		a.matricularEmDisciplina(d);
		a.matricularEmDisciplina(d1);
		a.emitirRelatorioAluno();
		d.pesquisarAlunos();
		c.pesquisarAlunos();
	}
}
