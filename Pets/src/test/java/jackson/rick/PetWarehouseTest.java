package jackson.rick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rickjackson on 1/31/17.
 */
public class PetWarehouseTest {
    private PetWarehouse petWarehouse;

    @Before
    public void setUp() throws Exception {
        petWarehouse = new PetWarehouse();
    }

    @Test
    public void getPetTest() throws Exception {
        Pet expected = null;
        Pet actual = petWarehouse.getPet(0);
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }
}