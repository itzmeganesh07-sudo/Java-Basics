package Conditionals;

import java.util.Scanner;

public class Questions001 {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
      System.out.println("The first number is");  
       int x = sc.nextInt();

       System.out.println("The second number is");
       int y = sc.nextInt();
        
       int add = x + y;
        System.out.println("the add is " + add);
        
       int diffrence = x - y;
        System.out.println(" the diffrence is " + diffrence);
     
        int multiply = x * y;
         System.out.println(" multiply is " + multiply);

         int result= x % y ;
          System.out.println("result is " + result);
    }
    
}
// taking user input and print sum , diffrence , multiply and divide.