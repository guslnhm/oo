import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora{
    //private List<Calculadora> calculos = new ArrayList<>();
    private String add_outra_figura = "a";
    private int tipo_figura;
    private Scanner sc = new Scanner(System.in);
    
    public Calculadora(){
        
    }
    
    public void calcular(){
        while(!add_outra_figura.equalsIgnoreCase("n")){
            System.out.println("1 - Quadrado\n2 - Retangulo\n3 - Triangulo\n4 - Circulo\n5 - Trapezio");
            System.out.print("Informe o tipo da figura:\n>> ");
            tipo_figura = sc.nextInt();
            sc.nextLine(); //consumindo quebra de linha residual de nextInt
            System.out.println("Deseja adicionar outra figura? (S/N)");
            add_outra_figura = sc.nextLine();
        }
    }
}
