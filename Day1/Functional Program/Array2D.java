
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        
         
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter two no");
        int n =sc.nextInt() ;    
        int m =sc.nextInt() ;  
        sc.close();
        int arr[][] = new int[n][m] ;

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                 arr[i][j]=sc.nextInt() ;
            }
        }
      

        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                   System.out.print(arr[i][j] + " ");
             }
             System.out.println();
        }

    }
}
