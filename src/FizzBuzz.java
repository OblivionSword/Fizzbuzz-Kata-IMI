public class FizzBuzz {

    public static void main(String[] args) {
        
        for (int n = 1; n <= 100; n++ ){
            System.out.println(fizzbuzz(n));
        }
    }

    public static String fizzbuzz(int i){
        
        String result;

        if ((i % 3 == 0) && (i % 5 == 0)) {
            result = "fizzbuzz";
        }
        else if ((i % 3 == 0) && (i / 10 == 3)){
            result = "fizzfizz";
        }
        else if((i % 3 == 0)){
            result = "fizz";
        }
        else if ((i % 10 == 3)){
            result = "fizz";
        }
        else if ((i % 5 == 0) && (i / 10 == 5) && (i > 50)){
            result = "buzzbuzz";
        }
        
        else if(i % 5 == 0){
            result = "buzz";
        }
        else if ((i % 10 == 5)){
            result = "buzz";
        }
        
        else{
            result = String.valueOf(i);
        }

        return result;

    }

    public static int ModuloCalculator(int n){
        int result = 0;

        if((n % 10 == 3)){
            result = n / 10;
            result = result % 10;
            System.out.println(result);
            
        }
        return result;
    }

}
