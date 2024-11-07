import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] fib = new int[10];
        for(int i=0; i<10; i++){
            if(i<=1) fib[i] = 1;
            else{
                fib[i] = fib[i-1] + fib[i-2];
            }
        }
        for(int i=0; i<10; i++){
            System.out.print(fib[i] + " ");
        }
    }
}