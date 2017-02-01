package jackson.rick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 2/1/17.
 */
public class PetComparatorTest {
    private PetComparator pc;
    
    @Before
    public void setUp() throws Exception {
        this.pc = new PetComparator();
    }
    
    @Test
    public void compareTest() throws Exception {
        int expected = -1;
        int actual = pc.compare(new Dog("Catdog"), new Cat("Dogcat"));
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}