import org.junit.Assert;
import org.junit.Test;

public class fizzbuzz_test {

    FizzBuzz fb = new FizzBuzz();
    
    @Test
    public void FizzBuzzOnlyOneAndTwo(){
        Assert.assertEquals("1", fb.fizzbuzz(1));
        Assert.assertEquals("2", fb.fizzbuzz(2));
    }

    @Test
    public void FizzBuzzThreeAnd9(){
        Assert.assertEquals("fizz", fb.fizzbuzz(3));
        Assert.assertEquals("fizz", fb.fizzbuzz(9));
    }

    @Test
    public void FizzBuzz10(){
        Assert.assertEquals("buzz", fb.fizzbuzz(10));
    }

    @Test
    public void FizzBuzz15(){
        Assert.assertEquals("fizzbuzz", fb.fizzbuzz(15));
    }

    @Test
    public void FizzBuzz30(){
        Assert.assertEquals("fizzbuzz", fb.fizzbuzz(30));
    }

    @Test
    public void FizzBuzz13(){
        Assert.assertEquals("fizz", fb.fizzbuzz(13));
    }

    @Test
    public void FizzBuzz25(){
        Assert.assertEquals("buzzbuzz", fb.fizzbuzz(25));
        
    }

    @Test
    public void FizzBuzz33(){
        Assert.assertEquals("fizzfizz", fb.fizzbuzz(33));
        
    }

    @Test
    public void FizzBuzz55(){
        Assert.assertEquals("buzzbuzz", fb.fizzbuzz(55));
        
    }

    @Test
    public void FizzBuzz50(){
        Assert.assertEquals("buzzbuzz", fb.fizzbuzz(50));
        
    }

    @Test
    public void FizzBuzz35(){
        Assert.assertEquals("fizzbuzzbuzz", fb.fizzbuzz(35));
        
    }


    @Test
    public void FizzBuzz53(){
        Assert.assertEquals("fizzbuzz", fb.fizzbuzz(53));
        
    }

    @Test
    public void FizzBuzz51(){
        Assert.assertEquals("fizzbuzz", fb.fizzbuzz(51));
        
    }


   

}
