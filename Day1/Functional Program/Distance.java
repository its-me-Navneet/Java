import java.util.Scanner;

public class Distance {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter two no");
        int x =sc.nextInt() ;    
        int y =sc.nextInt() ;     
        
        double squareSum = Math.pow(x, 2) + Math.pow(y, 2) ;
        double dis = Math.sqrt(squareSum);
         System.out.println(dis);
         sc.close();
        
    }
}
