package jackson.rick;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Dog extends Pet {

    Dog(String name) {
        super.name = name;
    }

    String speak() {
        return "Woof!";
    }
}
