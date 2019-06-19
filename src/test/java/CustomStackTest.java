import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomStackTest {
    private CustomStack<String> s;

    @Before
    public void inti() {
        s = new CustomStack<String>();
    }

    @Test
    public void testWhenStackIsEmptyAndReturnTrue() {
        assertEquals(true, s.empty());
    }

    @Test
    public void testWhenRemoveAnElementFromStackWhichHasAnElementThenEmptyMethodReturnsTrue() {
        s.push("sdfs");
        s.pop();
        assertEquals(true, s.empty());
    }

    @Test
    public void testWhenRemoveAnElementFromStackWhichHasMoreElementsThenEmptyMethodReturnsTrue() {
        s.push("sdfs");
        s.push("sdfs");
        s.pop();
        assertEquals(false, s.empty());
    }

    @Test
    public void testWhenSearchingAnElementInAStackWithAnElementThenSearchMethodReturns1() {
        s.push("sdfs");
        assertEquals(1, s.search("sdfs"));
    }

    @Test
    public void testWhenSearchingAnElementInAStackWithMoreElementsThenSearchMethodReturns1() {
        s.push("sdfs");
        s.push("sdfs1");
        assertEquals(1, s.search("sdfs1"));
    }

    @Test
    public void testIfSearchingMethodReturnsMinusOneWhenAnElementDoesNotExistInStack() {
        s.push("sdfs");
        s.push("sdfs1");
        s.push("sdfs2");
        assertEquals(-1, s.search("ana"));
    }
}
