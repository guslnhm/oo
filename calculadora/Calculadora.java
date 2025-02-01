public class Calculadora{
    int op1, op2;
    int resultado;
    
    public Calculadora(){
        op1 = 0;
        op2 = 0;
    }
    
    public Calculadora(int o1, int o2){
        op1 = o1;
        op2 = o2;
    }
    
    public void setOp1(int op){
        op1 = op;
    }
    
    public void setOp2(int op){
        op2 = op;
    }
    
    public int getOp1(){
        return op1;
    }
    
    public int getOp2(){
        return op2;
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public int somar(){
        resultado = op1+op2;
        return resultado;
    }
    
    public int subtracao(){
        resultado = op1-op2;
        return resultado;
    }
}