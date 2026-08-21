package array;

public class array2 {
    public static void main(String [] args){
        int a = 80;
        int [] marks = new int[5];
        for(int i = 0; i<5; i++){
             marks[i] = a;
            a++;
        }
        for(int i = 0; i<5; i++){
            System.out.println(marks[i]);
        }

    }
    
}
