package jackson.rick;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Output {

    Output() {

    }

    void askHowManyPets() {
        System.out.println("How many pets do you have?");
    }

    void askForPetName() {
        System.out.println("What is your pet's name?");
    }

    void askForPetType(String name) {
        System.out.println("What kind of pet is " + name + "?");
    }

    void listAndMakePetSpeak(Pet pet) {
        System.out.println("This is " + pet.getName() + ". \"" + pet.speak() + "\"");
    }
}
