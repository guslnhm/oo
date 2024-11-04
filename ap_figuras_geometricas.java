import java.util.Scanner;
import java.lang.Math;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    /*declarando scanner fora dos métodos, i.e., um atributo da classe
    para que seja possível que eu a use em todos os métodos; declaro como estática btw
    */
	public static void main(String[] args) {
		System.out.println("Escolha a figura geométrica desejada\n1 - Circulo\n2 - Quadrado\n3 - Retangulo\n4 - Trapezio\n5 - Triangulo");
		int opcao = sc.nextInt();
		switch(opcao){
		    case 1:
		        ap_circulo();
		        break;
		    case 2:
		        ap_quadrado();
		        break;
		    case 3:
		        ap_retangulo();
		        break;
		    case 4:
		        ap_trapezio();
		        break;
		    case 5:
		        ap_triangulo();
		        break;
		}
	}
	public static void ap_circulo(){
	    System.out.println("Informe o raio do círculo");
	    int raio = sc.nextInt();
	    double area = Math.PI*Math.pow(raio,2);
	    System.out.println("O perímetro do círculo é " + Math.PI*2*raio + "e a área é " + area);
	}
	public static void ap_quadrado(){
	    System.out.println("Informe o valor do lado:");
	    int lado = sc.nextInt();
	    System.out.println("O perímetro do quadrado é " + 4*lado + " e sua área é " + Math.pow(lado,2));
	}
	public static void ap_retangulo(){
	    System.out.println("Informe o valor da altura: ");
	    int altura = sc.nextInt();
	    System.out.println("Informe o valor da base: ");
	    int base = sc.nextInt();
	    System.out.println("O perímetro do retângulo é " + ((2*base)+(2*altura)) + " e sua altura é " + altura*base);
	}
	public static void ap_trapezio(){
	    
	}
	public static void ap_triangulo(){
	    
	}
}
