public class Main{
    
	public static void main(String[] args) {
		Quadrado[] qs;
		qs = new Quadrado[5];
		qs[0] = new Quadrado(3, "dm");
		qs[1] = new Quadrado(10, "mm");
		qs[2] = new Quadrado(3, "Km");
		qs[3] = new Quadrado(2, "dam");
		qs[4] = new Quadrado(20, "cm"); //
		//então eu instancio tanto o array quanto cada elemento individual
		
		for(Quadrado q: qs){ //sintaxe: para cada quadrado q no array qs
		    String resposta = "Quadrado " + q + "\n";
		    resposta += "lado: " + q.lado.getValor() + " " + q.lado.getUnidade() + "\n";
		    //resposta += "area: " + q.area.getValor() + " " + q.area.getUnidade() + "\n";
		    q.calcularArea();
		    float a = q.area.getValor();
		    resposta += "area: " + a + " " + q.area.getUnidade() + "²\n";
		    q.calcularPerimetro();
		    float p = q.perimetro.getValor();
		    resposta += "perimetro: " + p + " " + q.perimetro.getUnidade() + " \n";
		    
		    System.out.println(resposta);
		}
	}
	
}
