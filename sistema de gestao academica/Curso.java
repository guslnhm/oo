import java.util.ArrayList;
import java.util.List;

public class Curso{
    
    String nome,
           carga_horaria,
           turno;
           
    List<Aluno> alunos = new ArrayList<>();
    List<Disciplina> disciplinas = new ArrayList<>();
           
    Curso(String nome, String carga_horaria, String turno){
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.turno = turno;
    }
    
    public void cadastrarDisciplina(Disciplina d){
        disciplinas.add(d);
    }
    
    public void cadastrarAluno(Aluno a){
        alunos.add(a);
    }
    
    public void pesquisarAlunos(){
        /*for(Aluno aluno: alunos){
            if(aluno.matricula.equals(a.matricula)) return true;
        }
        return false;*/
        System.out.println("LISTA DE ALUNOS MATRICULADOS EM " + this.nome);
        for(Aluno a: alunos){
            System.out.println("    " + a.nome);
        }
        System.out.println("----------");
    }
}