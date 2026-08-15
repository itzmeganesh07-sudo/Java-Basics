package Conditionals;
import java.util.Scanner;


public class Questions002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      //  Sytem.out.println(" The number is zero")
       int a = 0;
        
        int x = sc.nextInt();
        //System.out.println("Unique number");
         
        //int i = 0;

        if(x == 0){
            System.out.println( "The number is zero");
        } else if (x > 0) {
           System.out.println("The number is positive");

            
        }
        else{
            System.out.println("The number is negative");
        }
    }

    
}
// does not matter where you initialize before taking input or after.
// 