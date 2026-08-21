package array;

public class array1 {
    public static void main(String[] args){
        int a = 133;
        int [] rollnum = new int[5];
        for(int i = 0; i<5; i++){
            
            rollnum[i] = a;
            a++;

        }
        for(int i = 0; i<5; i++){
            System.out.println(rollnum[i]);
        }
    }
    
}
