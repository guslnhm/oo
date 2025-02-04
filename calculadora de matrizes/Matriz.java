import java.util.List;
import java.util.ArrayList;

public class Matriz{
    
    int ai, aj, bi, bj;
    private static List<int[][]> matrizes = new ArrayList<>();
    
    public Matriz(){
    }
    
    public void nova_matriz(int[][] m, int i, int j, int k){
        matrizes.add(m);
        if(k==0){
            ai = i;
            aj = j;
        }
        else{
            bi = i;
            bj = j;
        }
    }
    
    public void imprimir(){
        for(int i=0; i<ai; i++){
            for(int j=0; j<aj; j++){
                System.out.println(matrizes.get(0)[i][j]);
            }
        }
        System.out.println("matriz 1 acima; matriz 2 abaixo");
        for(int i=0; i<bi; i++){
            for(int j=0; j<bj; j++){
                System.out.println(matrizes.get(1)[i][j]);
            }
        }
    }
    
    public void soma(){
        if(!(ai==bi && aj==bj)){
            System.out.println("Nao eh possivel calcular a soma das matrizes, as dimensoes sao diferentes.");
            return;
        }
        System.out.println("krl");
        for(int i=0; i<ai; i++){
            for(int j=0; j<aj; j++){
                matrizes.get(0)[i][j] += matrizes.get(1)[i][j];
                System.out.print(matrizes.get(0)[i][j] + " ");
            }
            System.out.println();
        }
    }
}