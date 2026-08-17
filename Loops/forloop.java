public class forloop {
    public static void main(String[] args) {
   /*    
        for(int i = 1; i<=10; i++){
            System.out.println(""  +i);
        }*/
       // nested loop
       for(int i = 1; i<=10; i++){
        for(int j = 6; j<=10; j++){
          //  System.err.println(+ j);
          System.err.println("" + i*j); // first loop exuecute then second loop will run until the condition false.
                                        // then first loop check the condition and run until the condition of first loop false.
        }                            
    }
    

    }
}

/*
flow of control of for
1.first assignement condition is evaluated(variable definition).
2.second the conditional statement is evaluated(True or False).
3.if true, the loop evaluated the condition until the value of i is greter than the conditional statement.

 */
