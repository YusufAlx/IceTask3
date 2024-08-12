import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("Original ArrayList: " + colours);
        colours.remove(2);
        System.out.println("Updated ArrayList: " + colours);
    }
}