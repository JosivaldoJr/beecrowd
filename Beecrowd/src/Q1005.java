import java.util.Scanner;

public class Q1005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double note1 = sc.nextDouble();
		double note2 = sc.nextDouble();
		double mp = ((note1*3.5)+(note2*7.5))/(3.5+7.5);
		
		System.out.println(String.format("MEDIA %.5f", mp));

	}

}
