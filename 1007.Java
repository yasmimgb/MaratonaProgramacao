  
import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]) {
     
     int A;
     int B;
     int C;
     int D;

     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite o primeiro número:");
     A = sc.nextInt();
     
     System.out.println("Digite o primeiro número:");
     B = sc.nextInt();
     
     System.out.println("Digite o primeiro número:");
     C = sc.nextInt();
     
     System.out.println("Digite o primeiro número:");
     D = sc.nextInt();
     
     int DIFERENÇA = (A*B-C*D);
     
     System.out.println("DIFERENÇA = " + DIFERENÇA);
    }
    
}
