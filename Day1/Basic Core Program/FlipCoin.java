import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter no of times to toss");
        int n =sc.nextInt() ; 
        int heads=0,tails=0 ;
        int N=n;
       while(n>0){

         Random rand = new Random() ; 

         double  prob= (double)Math.abs(rand.nextInt())/Integer.MAX_VALUE ; 

           if(prob <0.5) tails++;
           else heads++ ; 
           n--;
       } 

       double headsPercentage = (double)((double)heads/N)*100 ;  
       double tailsPercentage = (double)((double)tails/N)*100 ; 

       System.out.println("Head headsPercentage is "+ headsPercentage);
       System.out.println("Tail headsPercentage is "+ tailsPercentage);

    }
}
