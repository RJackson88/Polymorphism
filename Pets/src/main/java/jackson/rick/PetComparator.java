package jackson.rick;

import java.util.Comparator;

/**
 * Created by rickjackson on 2/1/17.
 */
public class PetComparator implements Comparator<Pet> {
    
    PetComparator() {
        
    }
    
    @Override
    public int compare(Pet p1, Pet p2) {
        if (!p1.getClass().getName().equalsIgnoreCase(p2.getClass().getName())) {
            return p1.getName().compareToIgnoreCase(p2.getName());
        } else {
            return p1.getClass().getName().compareToIgnoreCase(p2.getClass()
                    .getName());
        }
    }
}
