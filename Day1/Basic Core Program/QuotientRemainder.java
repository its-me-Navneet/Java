import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        
          
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter two no");
        int n1 =sc.nextInt() ;    
        int n2 =sc.nextInt() ; 
        
        try {
            int q=n1/n2 ;
            int rem=n1%n2 ;

            System.out.println("quotient of "+n1+" and "+n2 + " is "+q);
            System.out.println("remainder of "+n1+" % "+n2 + " is "+rem);

        } catch (Exception e) {
           System.out.println("Runtime error...check with other no");
        }

         
    }
}
