import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]){
        
      Scanner sc = new Scanner(System.in);
      int A,B,C,D;
    
     System.out.println("Digite o primeiro número:");
     A = sc.nextInt();
      System.out.println("Digite o segundo número:");
     B = sc.nextInt();
      System.out.println("Digite o terceiro número:");
     C = sc.nextInt();
      System.out.println("Digite o quarto número:");
     D = sc.nextInt();

    if(B > C && D > A && C + D > A + B && C > 0 && D > 0 && A/2 != 0){
        System.out.println("Valores aceitos");
    }else{
        System.out.println("Valores não aceitos");
    }
    }    
    }
