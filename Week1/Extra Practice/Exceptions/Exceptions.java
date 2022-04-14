import java.util.ArrayList;
import java.util.Random;
public class Exceptions {
    public static void main(String[] arg) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("24");
        myList.add("Hello Kobe Bryant");
        myList.add("23");
        myList.add("Hello Michael Jordan");


        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (24) myList.get(i);
            } catch (ClassCastException e) {
                System.out.println(e);
            }
        }
    } 
}
