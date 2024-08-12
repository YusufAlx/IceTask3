import java.util.ArrayList;
import java.util.Collections;

public class Question11 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("Original ArrayList: " + colours);
        Collections.reverse(colours);
        System.out.println("Reversed ArrayList: " + colours);
    }
}