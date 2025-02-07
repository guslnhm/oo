import java.util.Scanner;

public class Turma{
    
    private Disciplina disciplina;
    private Professor professor;
    private Aluno[] alunos = new Aluno[40];
    private String sala;
    private String horario;
    private static Scanner sc = new Scanner(System.in);
    private String codigo;
    private static String opcao;
    private int vagas_disponiveis = 40;
    
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
    
    public void matricular_aluno(){
        System.out.print("Informe o código do aluno a ser matriculado\n>> ");
        opcao = sc.nextLine();
        Aluno a = Cadastro.getAluno(opcao);
        if(a!=null){
            System.out.print("Deseja matricular o aluno " + a.getNome() + " na turma " + this.getCodigo() + " - " + this.getNome() + "? (s/n)\n>> ");
            opcao = sc.nextLine();
            if(opcao.equalsIgnoreCase("s")){
                this.alunos[40 - vagas_disponiveis] = a;
                vagas_disponiveis--;
                for(Aluno aa: alunos){
                    if(aa!=null) System.out.println(aa);
                }
            }
        }
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    @Override
    public String toString(){
        return codigo + " " + sala + " " + horario;
    }
    
    public String getNome(){
        return disciplina.getNome();
    }
    
    public void imprimir_frequencia(){
        int contador = 1;
        System.out.println(this.getCodigo() + " - " + this.getNome());
        System.out.println("Sala: " + this.sala);
        System.out.println(this.horario + "\n");
        System.out.println("Numero Matricula Nome");
        for(Aluno aa: alunos){
            if(aa!=null){
                System.out.println(contador++ + "      " + aa.getMatricula() + "    " + aa.getNome());
            }
        }
    }
    
}
