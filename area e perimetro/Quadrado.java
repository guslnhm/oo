public class Quadrado{
    
    Medida lado;
    Medida area, perimetro;
    //repare que eu não instanciei os objetos ainda! pra instanciar tem que usar o "new"
    //acima, apenas criei a referência
    
    /*float calcularPerimetro(Medida lado){
        perimetro = lado*
    }*/
    
    Quadrado(float valor, String unidade){
        lado = new Medida(valor, unidade);
    }
    
    Quadrado(Medida lado){
        this.lado = lado;
    }
    
    Medida calcularPerimetro(){
        String unidadeAdotada = lado.getUnidade();
        float p = 4*lado.getValor();
        perimetro = new Medida(p, unidadeAdotada); //instanciei
        return perimetro;
    }
    
    Medida calcularArea(){
        String unidadeAdotada = lado.getUnidade();
        float a = lado.getValor()*lado.getValor();
        area = new Medida(a, unidadeAdotada); //instanciei
        return area;
    }
}