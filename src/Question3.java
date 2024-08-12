import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("Original ArrayList: " + colours);
        colours.add(0, "Brown");
        System.out.println("Updated ArrayList: " + colours);
    }
}