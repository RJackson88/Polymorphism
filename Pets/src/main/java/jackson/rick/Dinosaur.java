package jackson.rick;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Dinosaur extends Pet {

    Dinosaur(String name) {
        super.name = name;
    }

    String speak() {
        return "I will eat you!";
    }
}
