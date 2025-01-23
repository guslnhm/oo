public class Quadrado extends FiguraGeometrica{
    
    Medida lado;
    
    public Quadrado(Medida lado){
        this.lado = lado;
    }
    
    public Quadrado(float valor, String unidade){
        lado = new Medida(valor, unidade);
    }
    
    public Medida calcularArea(){
        area = new Medida(lado.getValor()*lado.getValor(), " " + lado.getUnidade() + "²");
        return area;
    }
    //area e perimetro sobrescrevem essas variáveis definidas na superclasse (?)
    public Medida calcularPerimetro(){
        perimetro = new Medida(4*lado.getValor(), " " + lado.getUnidade());
        return perimetro;
    }
}