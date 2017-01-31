package jackson.rick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rickjackson on 1/31/17.
 */
public class PetFactoryTest {
    private PetFactory petFactory;
    private Cat cat;

    @Before
    public void setUp() throws Exception {
        petFactory = new PetFactory();
        cat = new Cat("Homer");
    }

//    @Test
//    public void generatePetTest() throws Exception {
//        Pet expected = cat;
//        Pet actual = petFactory.generatePet("Homer", "Cat");
//        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
//    }

    @Test
    public void getTotalPets() throws Exception {
        int expected = 0;
        int actual = petFactory.getTotalPets();
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }

}