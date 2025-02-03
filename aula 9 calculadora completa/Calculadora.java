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
    private String resposta;
    
    public Calculadora(){
        
    }
    
    public void calcular(){
        while(!add_outra_figura.equalsIgnoreCase("n")){
            System.out.println("1 - Quadrado\n2 - Retangulo\n3 - Triangulo\n4 - Circulo\n5 - Trapezio");
            System.out.print("Informe o tipo da figura:\n>> ");
            tipo_figura = sc.nextInt();
            sc.nextLine(); //consumir \n residual
            switch(tipo_figura){
                case 1:
                    System.out.println("Informe a medida do lado do quadrado:");
                    float valor = sc.nextFloat();//consumindo \n residual
                    sc.nextLine(); 
                    System.out.println("Informe a unidade do lado do quadrado:");
                    String unidade = sc.next();
                    Quadrado q = new Quadrado(valor, unidade);
                    /*lista_figuras.set(index, q);
                    index++;*/
                    lista_figuras.add(q);
                    break;
                case 2:
                    System.out.println("Informe a medida da base do retângulo:");
                    float valorBase = sc.nextFloat();
                    sc.nextLine(); //consumindo \n residual
                    System.out.println("Informe a unidade da base do retângulo: ");
                    String unidadeBase = sc.nextLine();
                    System.out.println("Informe a medida da altura do retângulo: ");
                    float valorAltura = sc.nextFloat();
                    //sc.nextLine(); //consumir \n residual
                    System.out.println("Informe a unidade da altura do retângulo ");
                    String unidadeAltura = sc.nextLine();
                    Retangulo r = new Retangulo(valorBase, unidadeBase, valorAltura, unidadeAltura);
                    lista_figuras.add(r);
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
            /*Quadrado q = (Quadrado) lista_figuras.get(0); //typecast
            q.calcularQuadrado();*/
        }
        for(FiguraGeometrica fig: lista_figuras){
            System.out.println(fig.resultado());
        }
    }
}
