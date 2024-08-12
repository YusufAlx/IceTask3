import java.util.ArrayList;

public class Question19 {
    public static void main(String[] args){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("ArrayList size before trimming: " + colours.size());
        colours.trimToSize();
        System.out.println("ArrayList size after trimming: " + colours.size());
    }
}
