import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz fb = new FizzBuzz();
    
    
    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzzOnlyOneAndTwo(){
        Assert.assertEquals("1", fb.fizzBuzz(1));
        Assert.assertEquals("2", fb.fizzBuzz(2));
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzzThreeAnd9(){
        Assert.assertEquals("fizz", fb.fizzBuzz(3));
        Assert.assertEquals("fizz", fb.fizzBuzz(9));
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz10(){
        Assert.assertEquals("buzz", fb.fizzBuzz(10));
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz15(){
        Assert.assertEquals("fizzbuzz", fb.fizzBuzz(15));
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz30(){
        Assert.assertEquals("fizzbuzz", fb.fizzBuzz(30));
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz13(){
        Assert.assertEquals("fizz", fb.fizzBuzz(13));
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz25(){
        Assert.assertEquals("buzzbuzz", fb.fizzBuzz(25));
        
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz33(){
        Assert.assertEquals("fizzfizz", fb.fizzBuzz(33));
        
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz55(){
        Assert.assertEquals("buzzbuzz", fb.fizzBuzz(55));
        
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz50(){
        Assert.assertEquals("buzzbuzz", fb.fizzBuzz(50));
        
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz35(){
        Assert.assertEquals("fizzbuzzbuzz", fb.fizzBuzz(35));
        
    }


    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz53(){
        Assert.assertEquals("fizzbuzz", fb.fizzBuzz(53));
        
    }

    @SuppressWarnings("static-access")
    @Test
    public void FizzBuzz51(){
        Assert.assertEquals("fizzbuzz", fb.fizzBuzz(51));
        
    }


   

}
