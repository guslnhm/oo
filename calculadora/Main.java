public class Main{
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora(2,3);
		int x = c1.somar();
		System.out.println(x);
		
		Calculadora c2 = new Calculadora();
		c2.setOp1(2);
		c2.setOp2(-2);
		int y = c2.somar();
		System.out.println(y);
	}
}
