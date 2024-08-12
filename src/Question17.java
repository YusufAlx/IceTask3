import java.util.ArrayList;

public class Question17 {
    public static void main(String[] args){
    ArrayList<String> colours = new ArrayList<>();
    colours.add("Blue");
    colours.add("Yellow");
    colours.add("Pink");
    colours.removeAll(colours);
    System.out.println(colours);
    }
}

