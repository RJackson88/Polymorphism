package jackson.rick;

import java.util.Comparator;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Pet implements Comparable<Pet> {
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
    
    @Override
    public int compareTo(Pet other) {
        if (!this.getName().equalsIgnoreCase(other.getName())) {
            return this.getName().compareToIgnoreCase(other.getName());
        } else {
            return this.getClass().getName().compareToIgnoreCase(other
                    .getClass().getName());
        }
    }
    
    
}
