import java.util.Scanner;

public class NthHarmonicNumber { 

   static  long gcd(long a,long b){

         if(a%b==0) return b;

         return gcd(b,a%b) ;
     }
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter no ");
        int n =sc.nextInt() ;  
 
          long deno=1;
        
        for(int i=1;i<=n;i++){
            deno=deno*i ;
        }

        long  ans=0 ;
      
         for(int i=1;i<=n;i++){
             ans+=(deno/i) ;
         }

         long hcf=gcd(deno,ans) ; 
       
          ans/=hcf ;
          deno/=hcf ;

          System.out.println(n +"th Harmonic no is " +ans+"/"+deno);
 
    }
}
