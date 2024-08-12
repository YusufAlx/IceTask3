import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("Yellow");
        colours.add("Pink");
        String searchElement = "Yellow";
        boolean found = colours.contains(searchElement);
        if (found) {
            System.out.println(searchElement + " is found in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not found in the ArrayList.");
        }
    }
}
