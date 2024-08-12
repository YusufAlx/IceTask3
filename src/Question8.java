import java.util.ArrayList;
import java.util.Collections;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("Original ArrayList: " + colours);
        Collections.sort(colours);
        System.out.println("Sorted ArrayList: " + colours);
    }
}