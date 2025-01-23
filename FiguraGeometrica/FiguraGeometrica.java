public abstract class FiguraGeometrica{
    
    Medida area,
           perimetro;
           
    public abstract Medida calcularArea();
    
    public abstract Medida calcularPerimetro();
    
    public Medida getArea(){
        return area;
    }
    
    public Medida getPerimetro(){
        return perimetro;
    }
}