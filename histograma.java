import java.util.Scanner;
/*
caso teste: 10 valores
valores: 6 2 3 4 5 5 6 5 4 3
desafio - histograma vertical
*/
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Insira a quantidade de valores:");
        int x = sc.nextInt();
        int[] v1 = new int[x];
        int maior = 0, menor=0;
        System.out.println("Insira os valores:");
        for(int i=0; i<x; i++){
            v1[i] = sc.nextInt();
            if(i==0) maior=v1[i];
            else if(v1[i]>maior) maior=v1[i];
            if(i==0) menor=v1[i];
            else if(v1[i]<menor) menor=v1[i];
        }
        System.out.println();
        for(int i=menor; i<=maior; i++){ //cuidado, usar o <= aqui porque queremos o maior valor também
            System.out.print(i + " ");
            for(int j=0;j<x;j++) if(v1[j]==i) System.out.print("*");
            System.out.println();
        }
    }
}