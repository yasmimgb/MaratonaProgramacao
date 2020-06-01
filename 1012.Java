import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		final double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Informe de A :");
		double A = sc.nextDouble();		
		
		System.out.println("Informe de B :");
		double B = sc.nextDouble();
		
		System.out.println("Informe de C :");
		double C = sc.nextDouble();
		
		double areaTriangulo = (A * C)/2; 
		double areaCirculo = (pi * Math.pow(C, 2)); 
		double areaTrapezio = ((A + B) * C ) / 2; 
		double areaQuadrado = (B * 2); 
		double areaRetangulo = (A * B); 

		
		
		System.out.println("TRIANGULO: " + areaTriangulo);
		System.out.println("CIRCULO: " + areaCirculo);
		System.out.println("TRAPEZIO: " + areaTrapezio);
		System.out.println("QUADRADO: " + areaQuadrado);
		System.out.println("RETANGULO: " + areaRetangulo);
		
		sc.close();
		
	}
}
