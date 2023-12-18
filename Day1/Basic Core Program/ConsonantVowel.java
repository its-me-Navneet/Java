import java.util.Scanner;

public class ConsonantVowel { 

    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter Character between a-z and A-Z");
        char c = sc.next().charAt(0);     
         
           c =Character.toLowerCase(c) ;

         if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
             System.out.println("Vowel");
         }
         else 
         System.out.println("Consonant");
    }
    
}
