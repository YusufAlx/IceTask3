import java.util.ArrayList;

    public class Question13 {
        public static void main(String[] args) {
            ArrayList<String> colours1 = new ArrayList<>();
            colours1.add("Blue");
            colours1.add("Yellow");
            colours1.add("Pink");
            ArrayList<String> colours2 = new ArrayList<>();
            colours2.add("Brown");
            colours2.add("Orange");
            colours2.add("Red");
            boolean areEqual = colours1.equals(colours2);
            if (areEqual) {
                System.out.println("The two ArrayLists are equal.");
            } else {
                System.out.println("The two ArrayLists are not equal.");
            }
        }
}
