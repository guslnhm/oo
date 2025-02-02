import java.util.List;
import java.util.ArrayList;

public class Turma{
    
    private String disciplina;
    private int codigo;
    private int totalVagas;
    private int vagasDisponiveis;
    
    private List<Aluno> alunos = new ArrayList<>();
    
    private static List<Turma> turmas = new ArrayList<>();
    
    public Turma(int qteVagas){ //CREATE
        totalVagas = qteVagas;
        vagasDisponiveis = qteVagas;
        turmas.add(this);
    }
    
    public int getTotalVagas(){
        return totalVagas;
    }
    
    public int getVagasDisponiveis(){
        return vagasDisponiveis;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getDisciplina(){
        return disciplina;
    }
    
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setTotalVagas(int totalVagas){
        this.totalVagas = totalVagas;
    }
    
    public boolean matricularAluno(Aluno aluno){
        if(this.vagasDisponiveis==0){
            System.out.println("ERRO: NAO FOI POSSIVEL MATRICULAR O ALUNO. TURMA LOTADA.");
            return false;
        }
        for(Aluno a: alunos){
            if(aluno.getMatricula() == a.getMatricula()){
                System.out.println("ERRO: ALUNO JA MATRICULADO.");
                return false;
            }
        }
        alunos.add(aluno);
        System.out.println("ALUNO MATRICULADO COM SUCESSO.");
        this.vagasDisponiveis--;
        return true;
    }
    
    public boolean desmatricularAluno(Aluno aluno){
        for(Aluno a: alunos){
            if(a.getMatricula() == aluno.getMatricula()){
                alunos.remove(aluno);
                System.out.println("ALUNO DESMATRICULADO COM SUCESSO.");
                return true;
            }
        }
        System.out.println("ERRO: ALUNO NAO ENCONTRADO.");
        return false;
    }
    
    public Aluno pesquisarAluno(int matricula){
        for(Aluno a: alunos) if(a.getMatricula()==matricula){
            //System.out.println("ALUNO ENCONTRADO.");
            System.out.println(a); //imprime a referência
            return a;
        }
        return null;
    }
    
    @Override
    public String toString(){
        return "    NOME DA DISCIPLINA: " + disciplina;
    }
    
    public static void listar_turmas(){ //READ
        System.out.println("LISTA DE OFERTA DE TURMAS:");
        for(Turma t: turmas){
            System.out.println(t);
        }
        System.out.println();
    }
    
    public static boolean buscar_turma(int codigo){ //READ PT 2
        for(Turma t: turmas){
            if(t.codigo==codigo){
                System.out.println("TURMA ENCONTRADA.");
                System.out.println(t);
                System.out.println();
                return true;
            }
        }
        System.out.println("ERRO: TURMA NAO ENCONTRADA." + "\n");
        return false;
    }
    
    public static boolean remover_turma(Turma turma){ //DELETE
        for(Turma t: turmas){
            if(t.codigo==turma.codigo){
                System.out.println("TURMA REMOVIDA COM SUCESSO." + "\n");
                turmas.remove(t);
                return true;
            }
        }
        System.out.println("ERRO: NAO FOI POSSIVEL REMOVER A TURMA ESPECIFICADA.");
        return false;
    }
    
    //UPDATE COM SOBRECARGA DE MÉTODO:
    public void atualizarTurma(String disciplina, int codigo, int totalVagas){
        this.disciplina = disciplina;
        this.codigo = codigo;
        this.totalVagas = totalVagas;
        System.out.println("TURMA ATUALIZADA COM SUCESSO.\n");
    }
    
    public void atualizarTurma(String disciplina, int codigo){
        this.disciplina = disciplina;
        this.codigo = codigo;
        System.out.println("TURMA ATUALIZADA COM SUCESSO.\n");
    }
    
    public void atualizarTurma(int codigo, int totalVagas){
        this.codigo = codigo;
        this.totalVagas = totalVagas;
        System.out.println("TURMA ATUALIZADA COM SUCESSO.\n");
    }
    
    public void atualizarTurma(String disciplina){
        this.disciplina = disciplina;
        System.out.println("TURMA ATUALIZADA COM SUCESSO.\n");
    }
    
    public void atualizarTurma(int totalVagas){
        this.totalVagas = totalVagas;
        System.out.println("TURMA ATUALIZADA COM SUCESSO.\n");
    }
    
    /*
    PROBLEMA: COMPILADOR INTERPRETA type funcao(String, int) COMO IGUAL, OU SEJA
    NÃO POSSO FAZER A SOBRECARGA DE MÉTODO PARA ATUALIZAR A TURMA
    COM DISCIPLINA E CÓDIGO, E DEPOIS COM DISCIPLINA E TOTAL DE VAGAS, POR EXEMPLO.
    COMO CONTORNAR ISSO?
    */
}