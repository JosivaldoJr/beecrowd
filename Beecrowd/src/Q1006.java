import java.util.*;

public class Q1006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double note1 = sc.nextDouble();
		double note2 = sc.nextDouble();
		double note3 = sc.nextDouble();
		double mp = ((note1*2)+(note2*3)+(note3*5))/(2+3+5);
		
		System.out.println(String.format("MEDIA = %.1f", mp));

	}

}
