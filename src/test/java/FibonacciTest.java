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
        List s = f.computeNonRecursive(10);
        assertEquals(1,s.get(2));
    }

    @Test
    public void test5rdElemetFromfibonaciiMethodThenMethodReturns3(){
        List s = f.computeNonRecursive(10);
        assertEquals(3,s.get(4));
    }
    @Test
    public void test8rdElemetFromfibonaciiMethodThenMethodReturns13(){
        List s = f.computeNonRecursive(10);
        assertEquals(13,s.get(7));
    }
}
