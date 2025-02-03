public class Medida{
    protected float valor;
    protected String unidade;
    
    public Medida(float valor, String unidade){
        this.valor = valor;
        this.unidade = unidade;
    }
    
    @Override
    public String toString(){
        return valor + " " + unidade;
    }
}
