public class Medida{
    
    float valor;
    String unidade;
    
    public Medida(float valor, String unidade){
        this.valor = valor;
        this.unidade = unidade;
    }
    
    public float getValor(){
        return valor;
    }
    
    public String getUnidade(){
        return unidade;
    }
}