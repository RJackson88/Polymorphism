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

    @Before
    public void setUp() throws Exception {
        this.pet = new Pet("Catdog");
    }

    @Test
    public void speakTest() throws Exception {
        String expected = "I am a pet!";
        String actual = pet.speak();
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }

    @Test
    public void getNameTest() throws Exception {
        String expected = "Catdog";
        String actual = pet.getName();
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }
    
    @Test
    public void compareToTest() throws Exception {
        Dog dog = new Dog("Dogcat");
        int expected = -1;
        int actual = pet.compareTo(dog);
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }
}