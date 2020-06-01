import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]) {
        float A;
        
     Scanner sc = new Scanner(System.in);
     
      System.out.println("Digite o número a ser analizado");
     A = sc.nextFloat();
     
     if (A >= 0 && A < 25) {
         System.out.printf("Intervalo [0,25]");
        }else if(A >= 25 && A <= 50){
         System.out.printf("Intervalo (25,50]");
        }else if(A > 50 && A <= 75){
         System.out.printf("Intervalo (50,75]");
        }else if(A > 75 && A <= 100){
         System.out.printf("Intervalo (75,100]");
        }else if(A < 0 && A > 100){
         System.out.printf("Fora de intervalo");
     }
    }
}
