import java.util.ArrayList;
import java.util.Collections;

public class Question16 {
    public static void main(String[] args){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Pink");
        ArrayList<String> colours1 = (ArrayList<String>) colours.clone();
        System.out.println("Cloned ArrayList: "+ colours1);

    }
}
