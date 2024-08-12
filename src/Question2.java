import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Pink");

        System.out.println("Using for loop:");
        for (int i = 0; i < colours.size(); i++) {
            System.out.println(colours.get(i));
        }
    }
}