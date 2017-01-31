package jackson.rick;

import java.util.Scanner;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Input {
    private Scanner scan;

    Input() {
        scan = new Scanner(System.in);
    }

    int askHowManyPets() {
        return Integer.valueOf(scan.nextLine());
    }

    String askForPetName() {
        return scan.nextLine();
    }

    String askForPetType() {
        return scan.nextLine();
    }
}
