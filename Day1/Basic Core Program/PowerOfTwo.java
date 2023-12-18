import java.util.Scanner;

public class PowerOfTwo {
    
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter n");
        int n =sc.nextInt() ;  

        if(n>=31){
             System.out.println("Please enter n upto 31");
              return ;
        }

         for(int i=0;i<=n;i++){
            System.out.print((1<<i) + " ");
         }
    }
}
