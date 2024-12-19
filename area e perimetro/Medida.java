public class Medida{
    float valor;
    String unidade;
    
    Medida(float valor, String unidade){
        this.valor = valor;
        this.unidade = unidade;
    }
    
    float getValor(){
        return valor;
    }
    
    String getUnidade(){
        return unidade;
    }
    
}