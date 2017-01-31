package jackson.rick;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Cat extends Pet {

    Cat(String name) {
        super.name = name;
    }

    String speak() {
        return "Meow!";
    }
}
