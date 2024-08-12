import java.util.ArrayList;
public class Question21 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("Original ArrayList: " + colours);
        String newElement = "Red";
        colours.set(1, newElement);
        System.out.println("ArrayList after replacement: " + colours);
    }
}
