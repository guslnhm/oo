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
    
    public String calcularArea(){
        area = new Medida(lado.valor*lado.valor, lado.unidade + "²");
        //System.out.println("Area: " + area);
        return "Area: " + area + "\n";
    }
    
    public String calcularPerimetro(){
        perimetro = new Medida(lado.valor*4, lado.unidade);
        //System.out.println("Perimetro: " + perimetro);
        return "Perimetro: " + perimetro + "\n";
    }
    
    public String resultado(){
        /*System.out.println("Quadrado: ");
        calcularArea();
        calcularPerimetro();
        System.out.println();*/
        return "Quadrado:\n" + calcularArea() + calcularPerimetro();
    }
    
}
