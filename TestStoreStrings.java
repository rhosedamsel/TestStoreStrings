import java.util.ArrayList;
import stringCollections.StoreStrings; // corrected import statement

public class TestStoreStrings {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>(); // corrected ArrayList declaration
        states.add("Virginia");
        states.add("New York"); // added missing semicolon
        states.add("Michigan");
        states.add("Indiana");
        states.add("Missouri");
        states.add("Indiana");
        states.sort(null);
        for (String state : states) {
            System.out.println(state); // added missing semicolon
        }
        if (StoreStrings.duplicateString(states)) {
            System.out.println("Error! Contains more than one entry of the same state in the list. Must have only one entry for the state in the list");
        } else {
            System.out.println(StoreStrings.count(states));
        }
    }
}
