public class Aluno{
    String nome,
           matricula,
           email;
          
    Curso curso;
    
    Aluno(String nome, String matricula, String email, Curso curso){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.curso = curso;
    }
    
    public void emitirRelatorioAluno(){
        
    }
}