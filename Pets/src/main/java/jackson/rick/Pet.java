package jackson.rick;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Pet {
    String name;

    Pet() {}

    Pet(String name) {
        this.name = name;
    }

    String speak() {
        return "I am a pet!";
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }
}
