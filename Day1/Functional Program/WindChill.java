import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in) ; 
            System.out.println("Enter temp and velocity for calculating wind chill");
        int t =sc.nextInt() ;    
        int v =sc.nextInt() ;     
        
         double windChill = 35.74 + 0.65*t + (0.4275*t - 35.75)*Math.pow(v,0.16) ; 

         System.out.println("windchill is  "+ windChill);
        sc.close();
    }
    
}
