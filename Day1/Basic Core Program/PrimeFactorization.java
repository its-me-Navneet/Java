import java.util.Scanner;

public class PrimeFactorization { 
    
     public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter number");
        int n =sc.nextInt() ;  
        
        for(int i=2;i*i<=n;i++){

             while(n%i==0){
                System.out.print(i +" "); 
                 n/=i;
             }
        }
         
        if(n>2) System.out.print(n);

     }
    
}
