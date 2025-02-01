import java.util.Scanner;

public class Main{
    static Calculadora calc = new Calculadora();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer, operacao;
		System.out.println("Usuário deseja realizar um cálculo? (s/n)");
		answer = sc.nextLine();
	    while(answer.equalsIgnoreCase("s")){
	        System.out.println("Informe o valor do operando1:");
	        calc.operando1 = sc.nextInt();
	        sc.nextLine(); //consumir o "\n" residual, que não é consumido por nextInt
	        System.out.println("Informe o valor do operando2:");
	        calc.operando2 = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Informe a operação desejada: (+, -, *, /, | -> inversão de sinal");
	        operacao = sc.nextLine();
	        switch(operacao){
	            case "+":
	                System.out.println("O resultado de " + calc.operando1 + " + " + calc.operando2 + " é " + calc.calcularSoma() + ".");
	                break;
	            case "-":
	                System.out.println("O resultado de " + calc.operando1 + " - " + calc.operando2 + " é " + calc.calcularSubtracao() + ".");
	                break;
	            case "*":
	                System.out.println("O resultado de " + calc.operando1 + " * " + calc.operando2 + " é " + calc.calcularMultiplicacao() + ".");
	                break;
	            case "/":
	                System.out.println("O resultado de " + calc.operando1 + " / " + calc.operando2 + " é " + calc.calcularDivisao() + ".");
	                break;
	            case "!":
	                System.out.println("O inverso de " + calc.operando1 + " é " + calc.inverterSinal() + ".");
	                break;
	            default:
	                break;
	        }
	        System.out.println();
	        System.out.println("Usuário deseja realizar um cálculo? (s/n)");
		    answer = sc.nextLine();
	    }
	}
}