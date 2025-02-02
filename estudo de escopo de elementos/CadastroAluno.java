import java.util.List;
import java.util.ArrayList;

public class CadastroAluno{
    static int qtd_alunos = 0;
    
    List<Aluno> alunos = new ArrayList<>();
    
    public void cadastrarAluno(Aluno a){
        alunos.add(a);
        incrementar();
    }
    
    public static void incrementar(){
        qtd_alunos++;
    }
}