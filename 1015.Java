import java.text.DecimalFormat;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe coordenado do ponto p1:");		
		double x1 = sc.nextDouble(); double y1 = sc.nextDouble();		
		
		System.out.println("Informe coordenado do ponto p2:");
		double x2 = sc.nextDouble(); double y2 = sc.nextDouble();	
		
				
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println(new DecimalFormat("##0.0000").format(distance));
		
		sc.close();
		
	}

}
