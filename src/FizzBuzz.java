import java.util.ArrayList;

public class FizzBuzz {

    public static void main(String[] args) {
        
        for (int n = 1; n <= 100; n++ ){
            System.out.println(fizzBuzz(n));
        }

    }

    public static String fizzBuzz(int i){
        
        String result;
        
        if ((i % 3 == 0) && (i % 5 == 0)) {
            result = "fizzbuzz";
        }

        else if((i % 3 == 0)){
            result = "fizz";
            
            if (i / 10 == 3){
                result = "fizz" + result ;
            }

            if(i / 10 == 5){
                result = result + "buzz";
            }
        }

        else if ((i % 10 == 3)){
            result = "fizz";

            if (i / 10 == 5){
                result = result +"buzz";
            }
        }
        
        else if(i % 5 == 0){
            result = "buzz";

            if(i / 10 == 3){
                result = "fizz" + result;
            }

            if(i % 10 == 5){
                result = result + "buzz";
            }
            else if(i / 10 == 5){
                result = result + "buzz";
            }
        }

        else{
            result = Integer.toString(i);
        }
        
        return result;

    }

}
