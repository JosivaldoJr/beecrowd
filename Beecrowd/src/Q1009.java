import java.util.*;

public class Q1009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		double salary = sc.nextDouble();
		double commission = sc.nextDouble();
		
		System.out.println(String.format("TOTAL = R$ %.2f", salary+(commission*0.15)));
	}

}
