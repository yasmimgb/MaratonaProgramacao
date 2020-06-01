import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		final double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Informe o valor do Raio :");
		
		double R = sc.nextDouble();
		sc.close();
		
		double VrVolume = (4/3) * pi * Math.pow(R, 3);
		
		System.out.println("VOLUME " + VrVolume);
	}

}
