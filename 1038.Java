import java.util.Scanner;
public class MyClass {
    
    public static void main(String[] args) {
		int A, B;
		float price = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha o código do produto: 1, 2, 3, 4 ou 5");
		A = input.nextInt();
		System.out.println("Forneça a quantidade: ");
		B = input.nextInt();
		if (A == 1) {
			price  = (float) (4.00 * B);
		}else if (A == 2) {
			price  = (float) (4.50 * B);
		}else if (A == 3) {
			price  = (float) (5.00 * B);
		}else if (A == 4) {
			price  = (float) (2.00 * B);
		}else if (A == 5) {
			price  = (float) (1.50 * B);
		}
		
		System.out.printf("Total: R$ %.2f\n",price);
	}

}
