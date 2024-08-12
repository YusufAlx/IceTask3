import java.util.ArrayList;

public class Question20 {
    public static void main(String[] args){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("ArrayList size before increasing size: " + colours);
        colours.ensureCapacity(6);
        colours.add("Red");
        colours.add("Brown");
        System.out.println("ArrayList elements: " + colours);
    }
}

