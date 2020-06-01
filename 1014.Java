import java.text.DecimalFormat;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Informe a distância :");
		int X = sc.nextInt();		
		
		System.out.println("Informe a capacidade em litros :");
		float Y = sc.nextFloat();		
		
		float valorConsumo = X/Y ;
				
		System.out.println( new DecimalFormat("##0.000").format(valorConsumo)  + " km/l");
		
		sc.close();
		
	}

}
