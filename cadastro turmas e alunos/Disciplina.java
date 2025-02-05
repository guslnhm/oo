import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Disciplina{
    
    private String nome;
    private String codigo;
    private int carga_horaria;
    private Scanner sc = new Scanner(System.in);
    private static List<Turma> turmas = new ArrayList<>();
    
    public Disciplina(String nome){
        this.nome = nome;
    }
    
    public void adicionar_turma(Turma t){
        turmas.add(t);
        for(Turma tt: turmas){
            System.out.println(tt);
        }
    }
    
}
