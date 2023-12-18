import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        
            
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter two no");
        int n1 =sc.nextInt() ;    
        int n2 =sc.nextInt() ;  

        int temp=n2 ;
        n2=n1 ;
        n1=temp ;

        System.out.println("Now 2 number is "+ n1 + "and" + n2); 
        
    }
}
