import java.util.Scanner;

public class CalculadoraMatrizes{
    
    private Scanner sc = new Scanner(System.in);
    private int ai, aj, bi, bj, e;
    private int[][] mx;
    private Matriz m = new Matriz();
    private int escolha;
    
    public CalculadoraMatrizes(){
        
    }
    
    public void iniciar(){
        System.out.print("Informe as dimensoes da matriz A:\n>> ");
        ai = sc.nextInt();
        sc.nextLine(); //consumir \n residual
        System.out.print(">> ");
        aj = sc.nextInt();
        sc.nextLine(); //consumir \n residual
        mx = new int[ai][aj];
        System.out.println("Entre com os valores da matriz A:");
        for(int i=0; i<ai; i++)
            for(int j=0; j<aj; j++){
                System.out.print(">> ");
                mx[i][j] = sc.nextInt();
                sc.nextLine(); //consumindo \n residual
            }
        m.nova_matriz(mx,ai,aj,0);
        //m.imprimir();
        
        
        System.out.print("\nInforme as dimensoes da matriz B:\n>> ");
        bi = sc.nextInt();
        sc.nextLine(); //consumir \n residual
        System.out.print(">> ");
        bj = sc.nextInt();
        sc.nextLine(); //consumir \n residual
        mx = new int[bi][bj]; //não preciso me preocupar em limpar o objeto perdido
                              //ao sobrescrever bi/bj em cima de mi/mj -> java tem
                              //coletor de lixo automático/garbage collector
        System.out.println("Entre com os valores da matriz B:");
        for(int i=0; i<bi; i++)
            for(int j=0; j<bj; j++){
                System.out.print(">> ");
                mx[i][j] = sc.nextInt();
                sc.nextLine(); //consumindo \n residual
            }
        m.nova_matriz(mx,bi,bj,1);
        //m.imprimir();
        
        System.out.print("\nQual operação você deseja fazer?\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao de matrizes\n4 - Multiplicacao por escalar\n5 - Transposta de matriz\n6 - Gravar matrizes\n>> ");
        /*escolha = sc.nextInt();
        sc.nextLine();*/
        switch(sc.nextInt()){
            case 1:
                m.soma();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        return;
    }
}