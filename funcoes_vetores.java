import java.util.Scanner;
public class Main
{
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	    int x = sc.nextInt();
	    int[] v = new int[x];
	    for(int i=0; i<x; i++){
	        v[i] = sc.nextInt();
	    }
	    avg(v, x);
	    amt_positive(v,x);
	    amt_negative(v,x);
	    amt0(v,x);
	    amt_even(v,x);
	    amt_odd(v,x);
	}
	public static void avg(int[] v, int x){
	    double y = 0;
	    for(int i=0; i<x; i++) y+=v[i];
	    y/=x;
	    System.out.println("a media dos valores lidos eh " + y);
	}
	public static void amt_positive(int[] v, int x){
	    int y=0;
	    for(int i=0;i<x;i++) if(v[i]>0) y++;
	    System.out.println("a qtd de numeros positivos lidos eh " + y);
	}
	public static void amt_negative(int[] v, int x){
	    int y=0;
	    for(int i=0;i<x;i++) if(v[i]<0) y++;
	    System.out.println("a qtd de numeros negativos lidos eh " + y);
	}
	public static void amt0(int[] v, int x){
	    int y=0;
	    for(int i=0;i<x;i++) if(v[i]==0) y++;
	    System.out.println("a qtd de zeros eh " + y);
	}
	public static void amt_even(int[] v, int x){
	    int y=0;
	    for(int i=0;i<x;i++) if(v[i]%2==0) y++;
	    System.out.println("a qtd de pares eh " + y); //0 é par?
	}
	public static void amt_odd(int[] v, int x){
	    int y=0;
	    for(int i=0;i<x;i++) if(v[i]%2!=0) y++;
	    System.out.println("a qtd de impares eh " + y);
	}
}
