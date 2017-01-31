package jackson.rick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 1/31/17.
 */
public class DogTest {
    private Dog dog;

    @Before
    public void setUp() throws Exception {
        dog = new Dog("");
    }

    @Test
    public void speakTest() throws Exception {
        String expected = "Woof!";
        String actual = dog.speak();
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }
}
