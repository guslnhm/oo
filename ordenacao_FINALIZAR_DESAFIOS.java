import java.util.Scanner;
/*
caso teste 
quantidade de valores: 10
elementos do vetor: 9 2 5 6 1 6 9 15 13 0
*/
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Informe o número de valores a serem gerados: ");
        int n = sc.nextInt();
        int[] v = new int[n];
        for(int i=0;i<n;i++) v[i] = sc.nextInt();
        System.out.print("Vetor original: ");
        for(int i=0;i<n;i++) System.out.print(v[i] + " ");
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(v[j]>v[i]){
                    int t = v[i];
                    v[i] = v[j];
                    v[j] = t;
                }
            }
        }
        System.out.print("Vetor ordenado: ");
        for(int i=0;i<n;i++) System.out.print(v[i] + " ");
        System.out.println();
        //DESAFIO 1 - verificar se x é um quadrado perfeito; em caso positivo, imprima na forma de matriz
        //o vetor original e o ordenado
        if(n%Math.sqrt(n)==0){
            int contador=0;
            for(int i=0;i<n;i++){
                if(contador==3){
                    contador=0;
                    System.out.println();
                }
                System.out.print("  " + v[i] + " ");
                contador++;
            }
        }
    }
}