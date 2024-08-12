import java.util.ArrayList;
public class Question22 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Pink");
        for (int i = 0; i < colours.size(); i++) {
            System.out.println("Element at index " + i + ": " + colours.get(i));
        }
    }
}

