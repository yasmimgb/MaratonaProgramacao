import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade em dias:");
		int dias = sc.nextInt();

	    System.out.println((dias / 365) + " anos");

	    System.out.println(((dias % 365) / 30) + " Meses");
	    System.out.println(((dias % 365) % 30) + " Dias");
	    
	    System.out.println("o pedo é lindo");
		sc.close();
	}


}
