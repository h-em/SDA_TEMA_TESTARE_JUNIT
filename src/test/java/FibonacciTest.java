import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonnaci f;

    @Before
    public void init(){
        f = new Fibonnaci();

    }

    @Test
    public void test3rdElemetFromfibonaciiMethodThenMethodReturns1(){
        assertEquals(1,f.computeNonRecursive(2));
    }

    @Test
    public void test5rdElemetFromfibonaciiMethodThenMethodReturns3(){
        assertEquals(3,f.computeNonRecursive(4));
    }
    @Test
    public void test8rdElemetFromfibonaciiMethodThenMethodReturns13(){
        assertEquals(13,f.computeNonRecursive(7));
    }

    @Test
    public void test3rdElemetFromfibonaciiMethodThenMethodReturns1R(){
        assertEquals(1,f.computeRecursive(2));
    }

    @Test
    public void test5rdElemetFromfibonaciiMethodThenMethodReturns3R(){
        assertEquals(3,f.computeRecursive(4));
    }
    @Test
    public void test8rdElemetFromfibonaciiMethodThenMethodReturns13R(){
        assertEquals(13,f.computeRecursive(7));
    }
}
