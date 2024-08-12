import java.util.ArrayList;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<String> originalColours = new ArrayList<>();
        originalColours.add("blue");
        originalColours.add("Yellow");
        originalColours.add("Pink");
        System.out.println("Original ArrayList: " + originalColours);
        ArrayList<String> copiedColours = new ArrayList<>(originalColours);
        System.out.println("Copied ArrayList: " + copiedColours);
    }
}
