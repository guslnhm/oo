import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        //System.out.println(frase);
        eh_palindromo(frase);
    }
    public static void eh_palindromo(String frase){
        String sem_espacos = frase.replaceAll(" ","");
        String stringfinal = sem_espacos.toLowerCase();
        //System.out.println(stringfinal);
        char[] vetor = stringfinal.toCharArray();
        //remover "-" e outros caracteres especiais, caso do palíndromo
        //"socorram-me subi no ônibus em marrocos"
        int size_string = vetor.length;
        int i=0;
        for(i=0; i<size_string; i++){
            if(vetor[i]!=vetor[size_string-1-i]) break;
            //meu erro estava em vetor[size_string-1-i]
            //lembrar que o último elemento de uma array de n itens tem index n-1
        }
        if(i!=size_string){
            System.out.println("nao eh palindromo");
            return;
        }
        else System.out.println("eh palindromo");
        return;
    }
}