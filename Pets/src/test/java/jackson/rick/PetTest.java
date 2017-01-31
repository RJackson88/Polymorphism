package jackson.rick;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rickjackson on 1/31/17.
 */
public class PetTest {
    private Pet pet;
    private String name;

    @Before
    public void setUp() throws Exception {
        this.name = "Big Dog";
        this.pet = new Pet(this.name);
    }

    @Test
    public void speakTest() throws Exception {
        String expected = "I am a pet!";
        String actual = pet.speak();
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }

    @Test
    public void getNameTest() throws Exception {
        String expected = "Big Dog";
        String actual = pet.getName();
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }
}