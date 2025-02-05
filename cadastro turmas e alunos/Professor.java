import java.util.Scanner;

public class Professor extends Pessoa{
    private String matricula;
    private String titulacao;
    private Scanner sc = new Scanner(System.in);
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public Professor(){
        System.out.print("Informe o nome do professor\n>> ");
        nome = sc.nextLine();
        System.out.print("Informe a matricula do professor\n>> ");
        matricula = sc.nextLine();
        System.out.print("Informe a titulacao do professor\n>> ");
        titulacao = sc.nextLine();
        System.out.print("Informe o telefone do professor\n>> ");
        telefone = sc.nextLine();
        System.out.print("Informe o email do professor\n>> ");
        email = sc.nextLine();
    }
    
    @Override
    public String toString(){
        return "NOME: " + nome;
    }
    
}
