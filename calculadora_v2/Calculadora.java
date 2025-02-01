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
        
        /*System.out.println("operando 1 antes: " + operando1);
        System.out.println("operando 2 antes: " + operando2);
        operando1 = operando1*(-1);
        operando2 = operando2*(-1);
        System.out.println("operando 1 depois: " + operando1);
        System.out.println("operando 2 depois: " + operando2);
        return 0;*/
        
        operando1 = operando1*(-1);
        return operando1;
    }
}