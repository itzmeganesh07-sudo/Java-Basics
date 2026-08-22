package array;

public class TwoD {
           public static void main(String [] args){
        int [] [] marks = new int [3][3];
           
         marks [0][0] = 50;
         marks [0][1] = 45;
         marks [0][2] = 65;

         marks [1][0] = 75;
         marks [1][1] = 85;
         marks [1][2] = 62;

         marks [2][0] = 54;
         marks [2][1] = 34;
         marks [2][2] = 65;
         
         for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                System.out.println(marks[row][col]);
            }
            System.out.println();
         }
        
       }
    
}
