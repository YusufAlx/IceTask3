import java.util.ArrayList;
import java.util.Collections;

public class Question14 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("Original ArrayList:"+ colours);
        int index1=0;
        int index2=1;
        Collections.swap(colours,index1,index2);
        System.out.println("Arraylist after swapping:"+ colours);
    }
}
