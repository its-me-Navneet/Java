import java.util.Scanner;

public class LargestOfThree {
    
     public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter three  no");
        int max=0 ;
         for(int i=0;i<3;i++){

            int n=sc.nextInt() ;
            max=Math.max(max, n) ;
         }
         System.out.println("Maximum among three is "+ max);

     }

}
