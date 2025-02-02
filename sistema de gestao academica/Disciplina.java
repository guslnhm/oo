import java.util.ArrayList;
import java.util.List;

public class Disciplina{
    String nome,
           codigo,
           carga_horaria,
           professor_responsavel;
    
    List<Curso> cursos = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();
           
    Disciplina(String nome, String codigo, String carga_horaria, String professor_responsavel){
        this.nome = nome;
        this.codigo = codigo;
        this.carga_horaria = carga_horaria;
        this.professor_responsavel = professor_responsavel;
    }
    
    public void pesquisarAlunos(){
        /*for(Aluno aluno: alunos) if(aluno.matricula.equals(a.matricula)) return true;
        return false;*/
        System.out.println("LISTA DE ALUNOS MATRICULADOS EM " + this.nome);
        for(Aluno a: alunos){
            System.out.println("    " + a.nome);
        }
        System.out.println("----------");
    }
    
    public void matricularAluno(Aluno a){
        alunos.add(a);
    }
}