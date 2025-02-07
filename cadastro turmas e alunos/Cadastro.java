import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro{
    
    Scanner sc = new Scanner(System.in);
    int opcao = 0;
    String string_input;
    private static List<Aluno> alunos = new ArrayList<>();
    List<Professor> professores = new ArrayList<>();
    private static List<Turma> turmas = new ArrayList<>();
    
    public Cadastro(){
        
    }
    
    public void iniciar(){
        while(opcao!=6){
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Cadastrar turma");
            System.out.println("4 - Matricular aluno em turma");
            System.out.println("5 - Imprimir lista de frequencia para uma turma");
            System.out.println("6 - Sair");
            System.out.print(">> ");
            opcao = sc.nextInt();
            sc.nextLine(); //consumir quebra de linha
            switch(opcao){
                case 1:
                    Aluno a = new Aluno();
                    alunos.add(a);
                    break;
                case 2:
                    Professor p = new Professor();
                    professores.add(p);
                    break;
                case 3:
                    Turma t = new Turma();
                    turmas.add(t);
                    break;
                case 4:
                    System.out.print("Qual turma voce deseja matricular alunos?\n>> ");
                    string_input = sc.nextLine();
                    for(Turma tt:turmas){
                        if(tt.getCodigo().equalsIgnoreCase(string_input)){
                            tt.matricular_aluno();
                        }
                    }
                    break;
                case 5:
                    System.out.print("Qual turma voce deseja imprimir a lista?\n>> ");
                    string_input = sc.nextLine();
                    for(Turma ttt: turmas){
                        if(ttt.getCodigo().equalsIgnoreCase(string_input)){
                            ttt.imprimir_frequencia();
                        }
                    }
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        }
    }
    
    public static Turma getTurma(String codigo){
        for(Turma t: turmas){
            if(t.getCodigo().equalsIgnoreCase(codigo)) return t;
        }
        return null;
    }
    
    public static Aluno getAluno(String matricula){
        for(Aluno a: alunos){
            if(a.getMatricula().equalsIgnoreCase(matricula)) return a;
        }
        return null;
    }
}
