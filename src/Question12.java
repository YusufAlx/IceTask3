import java.util.ArrayList;

public class Question12{
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("Yellow");
        colours.add("Pink");
        colours.add("Red");
        colours.add("Green");
        System.out.println("Original ArrayList: " + colours);
        int startIndex = 1;
        int endIndex = 4;
        ArrayList<String> portion = new ArrayList<>(colours.subList(startIndex, endIndex));
        System.out.println("Extracted Portion: " + portion);
    }
}
