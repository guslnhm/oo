public class Calculadora{
    int operando1;
    int operando2;
    int resposta;
    
    Calculadora(){
        operando1 = 0;
        operando2 = 0;
    }
    
    Calculadora(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
    }
    
    Calculadora(int op1){
        operando1 = op1;
    }
    
    int calcularSoma(){
        resposta = operando1+operando2;
        return resposta;
    }
    
    int calcularSubtracao(){
        resposta = operando1-operando2;
        return resposta;
    }
    
    int calcularMultiplicacao(){
        resposta = operando1*operando2;
        return resposta;
    }
    
    int calcularDivisao(){
        resposta = operando1/operando2;
        return resposta;
    }
    
    int inverterSinal(){
        resposta = operando1*(-1);
        return resposta;
    }
}