import java.util.Scanner;

public class Turma{
    
    private Disciplina disciplina;
    private Professor professor;
    private Aluno[] alunos = new Aluno[40];
    private String sala;
    private String horario;
    private Scanner sc = new Scanner(System.in);
    private String codigo;
    private String opcao;
    
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
        Disciplina.adicionar_turma(this);//método estático, chamando pela classe
    }
    
    public static void matricular_aluno(){
        System.out.print("Qual turma você deseja matricular alunos?\n>> ");
        opcao = sc.nextLine();
        Turma t = Disciplina.buscar_turma(opcao);
        if(t!=null){
            
        }
        return;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    @Override
    public String toString(){
        return codigo + " " + sala + " " + horario;
    }
}
