public class Quadrado extends FiguraGeometrica{
    
    Medida lado;
           
    public Quadrado(Medida lado){
        this.lado = lado;
        /*não preciso instanciar um novo objeto (new)
        pois se eu recebo um objeto do tipo Medida como argumento,
        é sinal que ele já foi criado/instanciado*/
    }
    
    public Quadrado(float valor, String unidade){
        lado = new Medida(valor, unidade);
    }
    
    public void calcularArea(){
        area = new Medida(this.lado.valor*this.lado.valor, this.lado.unidade + "²");
        System.out.println("Area: " + area);
    }
    
    public void calcularPerimetro(){
        perimetro = new Medida(this.lado.valor*4, this.lado.unidade);
        System.out.println("Perimetro: " + perimetro);
    }
    
    public void calcularQuadrado(){
        System.out.println("Quadrado: ");
        calcularArea();
        calcularPerimetro();
        System.out.println();
    }
    
}
