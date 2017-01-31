package jackson.rick;

/**
 * Created by rickjackson on 1/31/17.
 */
public class PetFactory {
    int totalPets;

    PetFactory() {
        this.totalPets = 0;
    }

    Pet generatePet(String name, String type) {

        if (type.equalsIgnoreCase("dog")) {
            return new Dog(name);
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat(name);
        } else if (type.equalsIgnoreCase("dinosaur")) {
            return new Dinosaur(name);
        } else {
            return new Pet(name);
        }
    }

    int getTotalPets() {
        return this.totalPets;
    }

    void setTotalPets(int i) {
        this.totalPets = i;
    }
}
