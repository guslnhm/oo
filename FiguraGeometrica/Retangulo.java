public class Retangulo extends FiguraGeometrica{
    
    Medida base,
           altura;
           
    public Retangulo(Medida base, Medida altura){
        this.base = base;
        this.altura = altura;
    }
    
    public Retangulo(float valorBase, String unidadeBase, float valorAltura, String unidadeAltura){
        base = new Medida(valorBase, unidadeBase);
        altura = new Medida(valorAltura, unidadeAltura);
    }
    
    public Medida calcularArea(){
        area = new Medida(base.getValor()*altura.getValor(),  " " + base.getUnidade() + "²");
        return area;
    }
    
    public Medida calcularPerimetro(){
        perimetro = new Medida((base.getValor()*2)+(altura.getValor()*2), " " + base.getUnidade());
        return perimetro;
    }
}