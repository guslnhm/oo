public class Quadrado{
    
    Medida lado,
           area,
           perimetro;
           
    public Quadrado(Medida lado){
        this.lado = lado;
        /*não preciso instanciar um novo objeto (new)
        pois se eu recebo um objeto do tipo Medida como argumento,
        é sinal que ele já foi criado/instanciado*/
    }
    
    public Quadrado(float valor, String unidade){
        lado = new Medida(valor, unidade);
    }
}
