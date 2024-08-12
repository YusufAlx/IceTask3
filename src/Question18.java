import java.util.ArrayList;

public class Question18 {
    public static void main(String[] args){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Pink");
        boolean isEmpty = colours.isEmpty();
        if (isEmpty) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}