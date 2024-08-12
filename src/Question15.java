import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
public class Question15 {
    public static void main(String[] args){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Pink");
        ArrayList<String> colours1 = new ArrayList<>();
        colours1.add("Brown");
        colours1.add("Green");
        colours1.add("Orange");
        ArrayList<String> combinedList = new ArrayList<>(colours);
        combinedList.addAll(colours1);
        System.out.println("Combined List:"+ combinedList);

    }
}
