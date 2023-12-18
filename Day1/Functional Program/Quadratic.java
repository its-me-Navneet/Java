import java.util.Scanner;

public class Quadratic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter three no as a b and c for aX^2 + bX + c");
        int a =sc.nextInt() ;    
        int b =sc.nextInt() ;    
        int c =sc.nextInt() ;   
        sc.close();
        try {
          double delta =b*b-4*a*c ; 

          if(delta <0) {
             System.out.println("Real roots does not exist for the given equation");
              return ;
          }
          
          double root1 = (-b+ Math.sqrt(delta))/2*a ;
          double root2 = (-b- Math.sqrt(delta))/2*a ;
          
          System.out.println("Root of the given quadratic equation is "+root1 + "and "+root2);

        } catch (Exception e) {
            System.out.println("root does not exist");
        }

        
    }
}
