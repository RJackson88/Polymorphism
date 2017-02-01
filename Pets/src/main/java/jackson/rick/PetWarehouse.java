package jackson.rick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rickjackson on 1/31/17.
 */
public class PetWarehouse extends PetFactory {
    private Input in;
    private Output out;
    private int totalPets;
    List<Pet> petList;

    PetWarehouse() {
        this.in = new Input();
        this.out = new Output();
        this.totalPets = 0;
        this.petList = new ArrayList<>();
    }

    Pet getPet(int index) {
        return this.petList.get(index);
    }

    void addPet(Pet name) {
        this.petList.add(name);
    }

    List listOfPets() {
        return petList;
    }
}
