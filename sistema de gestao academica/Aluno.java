import java.util.ArrayList;
import java.util.List;

public class Aluno{
    String nome,
           matricula,
           email;
          
    Curso curso;
    
    List<Disciplina> disciplinas = new ArrayList<>();
    
    Aluno(String nome, String matricula, String email, Curso curso){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.curso = curso;
    }
    
    public void matricularEmDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
        disciplina.matricularAluno(this); //adiciona o aluno à disciplina
    }
    
    public void emitirRelatorioAluno(){
        System.out.println("NOME: " + nome);
        System.out.println("MATRICULA: " + matricula);
        System.out.println("CURSO: " + curso.nome);
        System.out.println("LISTA DE DISCIPLINAS:");
        for(Disciplina d: disciplinas){
            System.out.println("    " + d.nome);
        }
        System.out.println("----------");
    }
}