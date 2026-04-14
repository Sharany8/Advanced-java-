import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFromSecond {
    public static void main(String[] args) {
        LinkedList<String> listobj = new LinkedList<>();
        listobj.add("Red");
        listobj.add("Blue");
        listobj.add("Green");
        listobj.add("Yellow");

        Iterator<String> iteratorobj = listobj.listIterator(1);

        System.out.println("Elements starting from 2nd position:");
        while (iteratorobj.hasNext()) {
            System.out.println(iteratorobj.next());
        }
    }
}