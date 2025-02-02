import java.util.List;
import java.util.ArrayList;

public class Turma{
    
    private String disciplina;
    private int codigo;
    private int totalVagas;
    private int vagasDisponiveis;
    
    private List<Aluno> alunos = new ArrayList<>();
    
    public Turma(int qteVagas){
        totalVagas = qteVagas;
    }
    
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setTotalVagas(int totalVagas){
        this.totalVagas = totalVagas;
    }
    
    public boolean matricularAluno(Aluno aluno){
        for(Aluno a: alunos){
            if(aluno.getMatricula() == a.getMatricula()){
                System.out.println("ERRO: ALUNO JA MATRICULADO.");
                return false;
            }
        }
        alunos.add(aluno);
        System.out.println("ALUNO MATRICULADO COM SUCESSO.");
        return true;
    }
    
    public boolean desmatricularAluno(Aluno aluno){
        for(Aluno a: alunos){
            if(a.getMatricula() == aluno.getMatricula()){
                alunos.remove(aluno);
                System.out.println("ALUNO DESMATRICULADO COM SUCESSO.");
                return true;
            }
        }
        System.out.println("ERRO: ALUNO NAO ENCONTRADO.");
        return false;
    }
    
    public Aluno pesquisarAluno(int matricula){
        for(Aluno a: alunos) if(a.getMatricula()==matricula){
            //System.out.println("ALUNO ENCONTRADO.");
            System.out.println(a); //imprime a referência
            return a;
        }
        return null;
    }
    
}