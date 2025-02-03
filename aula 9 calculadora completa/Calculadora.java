import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora{
    //private List<Calculadora> calculos = new ArrayList<>();
    private String add_outra_figura = "a";
    private int tipo_figura;
    private Scanner sc = new Scanner(System.in);
    private List<FiguraGeometrica> lista_figuras = new ArrayList<>();
    //private static int index = 0;
    
    public Calculadora(){
        
    }
    
    public void calcular(){
        while(!add_outra_figura.equalsIgnoreCase("n")){
            System.out.println("1 - Quadrado\n2 - Retangulo\n3 - Triangulo\n4 - Circulo\n5 - Trapezio");
            System.out.print("Informe o tipo da figura:\n>> ");
            tipo_figura = sc.nextInt();
            switch(tipo_figura){
                case 1:
                    System.out.println("Informe a medida do lado do quadrado:");
                    float valor = sc.nextFloat();
                    sc.nextLine(); //consumindo \n residual
                    System.out.println("Informe a unidade do lado do quadrado:");
                    String unidade = sc.nextLine();
                    Quadrado q = new Quadrado(valor, unidade);
                    /*lista_figuras.set(index, q);
                    index++;*/
                    lista_figuras.add(q);
                    break;
                case 2:
                    //retangulo;
                    break;
                case 3:
                    //triangulo;
                    break;
                case 4:
                    //Circulo
                    break;
                case 5:
                    //Trapezio
                    break;
                default:
                    break;
            }
            sc.nextLine(); //consumindo quebra de linha residual de nextInt
            System.out.println("\nDeseja adicionar outra figura? (S/N)");
            add_outra_figura = sc.nextLine();
            System.out.println();
            Quadrado q = (Quadrado) lista_figuras.get(0); //typecast
            q.calcularQuadrado();
        }
    }
}
