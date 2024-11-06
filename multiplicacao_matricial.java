import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();
        int p = sc.nextInt();
        //só é possível multiplicar 2 matrizes Aij Bij quando
        //Aj = Bi
        if(n!=o) return;
        int[][] m1 = new int[m][n];
        int[][] m2 = new int[o][p];
        int[][] m3 = new int[m][p];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                m1[i][j] = sc.nextInt();
        for(int i=0;i<o;i++)
            for(int j=0;j<p;j++)
                m2[i][j] = sc.nextInt();
        m3 = multiplica_matrizes(m1,m2,m,n,o,p);
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                System.out.print(m3[i][j] + " "); //sem println!
            }
            System.out.println();
        }
    }
    public static int[][] multiplica_matrizes(int[][] m1, int[][] m2, int m, int n, int o, int p){
        int[][] m3 = new int[m][p];
        //nova matriz tem dimensões MxP
        //eu faço a primeira linha, iterando de coluna a coluna
        //mas cada elemento tem N==O operações, então tem um loop aí
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<n;k++){
                    m3[i][j] += m1[i][k]*m2[k][j];
                    //é esse o código!
                    //m3[i][j] vai fazer a iteração certinha
                    //a minha dúvida é, pelo fato de não ter sido inicializado com zeros
                    //não vai ter problema começar com +=? em c isso provavelmente daria um problemão
                }
            }
        }
        return m3;
    }
}