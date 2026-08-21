package array;

public class array4 {
    public static void main(String[] args) {
        
        int [] arr = {12,7,8, 15, 20, 33, 44};
        int  count = 0;
        for(int i = 0; i<7; i++){
            if(arr[i] % 2 == 0){
                 count++;
            }
          
        }
        System.out.println(count);
    }
    
}
