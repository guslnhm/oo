import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    private String semestre_de_ingresso;
    private Scanner sc = new Scanner(System.in);
    private static List<Aluno> alunos = new ArrayList<>();
    
    
    public Aluno(){
        System.out.print("Informe o nome do aluno\n>> ");
        nome = sc.nextLine();
        System.out.print("Informe a matricula do aluno\n>> ");
        matricula = sc.nextLine();
        System.out.print("Informe o curso do aluno\n>> ");
        curso = sc.nextLine();
        System.out.print("Informe o semestre de ingresso\n>> ");
        semestre_de_ingresso = sc.nextLine();
        System.out.print("Informe o email do aluno\n>> ");
        email = sc.nextLine();
        System.out.print("Informe o telefone do aluno\n>> ");
        telefone = sc.nextLine();
        alunos.add(this);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public void setSemestre_de_ingresso(String s){
        semestre_de_ingresso = s;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome;
    }
    
    public static Aluno buscar_aluno(String matricula){
        for(Aluno a: alunos){
            if(a.matricula.equalsIgnoreCase(matricula)) return a;
        }
        return null;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
}
