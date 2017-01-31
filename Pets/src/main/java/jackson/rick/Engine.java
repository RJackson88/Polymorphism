package jackson.rick;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Engine {
    private Input in;
    private Output out;
    private PetFactory petFactory;
    private PetWarehouse petWarehouse;

    Engine() {
        in = new Input();
        out = new Output();
        petFactory = new PetFactory();
        petWarehouse = new PetWarehouse();
    }

    void run() {
        out.askHowManyPets();
        petFactory.setTotalPets(in.askHowManyPets());

        for (int i = 0; i < petFactory.getTotalPets(); i++) {
            out.askForPetName();
            String name = in.askForPetName();
            out.askForPetType(name);
            String type = in.askForPetType();
            Pet pet = petFactory.generatePet(name, type);
            petWarehouse.addPet(pet);
        }

        for (Pet p : petWarehouse.petList) {
            out.listAndMakePetSpeak(p);
        }
    }
}
