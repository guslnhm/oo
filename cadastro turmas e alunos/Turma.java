import java.util.Scanner;

public class Turma{
    
    private Disciplina disciplina;
    private Professor professor;
    private Aluno[] alunos = new Aluno[40];
    private String sala;
    private String horario;
    private Scanner sc = new Scanner(System.in);
    private String codigo;
    
    public Turma(){
        System.out.print("Informe o nome da disciplina\n>> ");
        disciplina = new Disciplina(sc.nextLine());
        System.out.print("Qual sala essa turma ocupa?\n>> ");
        sala = sc.nextLine();
        System.out.print("Qual o horario dessa turma?\n>> ");
        horario = sc.nextLine();
        System.out.print("Qual o codigo da turma?\n>> ");
        codigo = sc.nextLine();
        /*E O PROFESSOR?*/
    }
    
    @Override
    public String toString(){
        return sala + " " + horario;
    }
}
