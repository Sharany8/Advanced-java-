import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> objlist = new LinkedList<>();
        objlist.add("Red");
        objlist.add("Blue");
        objlist.add("Green");
        objlist.add("Yellow");

        Iterator<String> it = objlist.descendingIterator();

        System.out.println("Elements in reverse order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}