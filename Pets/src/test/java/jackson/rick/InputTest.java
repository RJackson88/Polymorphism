package jackson.rick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rickjackson on 1/31/17.
 */
public class InputTest {
    private Input input;

    @Before
    public void setUp() throws Exception {
        input = new Input();
    }

    @Test
    public void askHowManyPetsTest() throws Exception {
        int expected = 0;
        int actual = input.askHowManyPets();
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void askForPetNameTest() throws Exception {
        String expected = "";
        String actual = input.askForPetName();
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void askForPetTypeTest() throws Exception {
        String expected = "";
        String actual = input.askForPetType();
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

}