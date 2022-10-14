import java.util.*;
public class Q1010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double value1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double value2 = sc.nextDouble();
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", (num1*value1)+(num2*value2)));

	}

}
