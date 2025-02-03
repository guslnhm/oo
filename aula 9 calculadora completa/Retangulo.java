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
    
    public String calcularArea(){
        area = new Medida(base.valor*altura.valor, base.unidade + "²");
        //System.out.println("Area: " + area);
        return "Area: " + area + "\n";
    }
    
    public String calcularPerimetro(){
        perimetro = new Medida(base.valor*2 + altura.valor*2, base.unidade);
        //System.out.println("Perimetro: " + perimetro);
        return "Perimetro: " + perimetro + "\n";
    }
    
    public String resultado(){
        /*System.out.println("Retangulo: ");
        calcularArea();
        calcularPerimetro();
        System.out.println(area);
        System.out.println(perimetro);*/
        return "Retangulo: \n" + calcularArea() + calcularPerimetro();
    }
}
