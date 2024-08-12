import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("Yellow");
        colours.add("Pink");
        System.out.println("Original colour list:"+ colours);
        int index = 1;
        String newElement = "Black";
        colours.set(index, newElement);
        System.out.println("Updated colour list:" + colours);
    }
}

