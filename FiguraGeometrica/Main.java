public class Main{
	public static void main(String[] args) {
		FiguraGeometrica[] fg = new FiguraGeometrica[3];
		
		fg[0] = new Quadrado(new Medida(10, "cm"));
		fg[0].calcularArea();
		fg[0].calcularPerimetro();
		System.out.println(fg[0].getArea().getValor() + " " + fg[0].getArea().getUnidade());
		
		fg[1] = new Retangulo(50, "m", 20, "m");
		fg[1].calcularArea();
		fg[1].calcularPerimetro();
		System.out.println(fg[1].getArea().getValor() + " " + fg[1].getArea().getUnidade());
		System.out.println(fg[1].getPerimetro().getValor() + " " + fg[1].getPerimetro().getUnidade());
	}
}
