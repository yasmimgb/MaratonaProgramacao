import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Informe de A :");
		int A = sc.nextInt();		
		
		System.out.println("Informe de B :");
		int B = sc.nextInt();
		
		System.out.println("Informe de C :");
		int C = sc.nextInt();
		
		
		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorTodos = (maiorAB + C + Math.abs(maiorAB - C))/ 2;
				
		System.out.println(maiorTodos + " eh o maior");
		
		sc.close();
		
	}
}
