import java.util.Scanner;

public class Q1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int hours = sc.nextInt();
		double salHours = sc.nextDouble();
		
		double salary = hours * salHours;
		System.out.println("NUMBER = "+num);
		System.out.println(String.format("SALARY = U$ %.2f", salary));
		
		

	}

}
