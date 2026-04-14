import java.util.*;

public class ListOperationsDemo {

    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);
    }

    public static void addElementAtIndex(List<String> list) {
        list.add(1, "Mango");
        System.out.println("After adding at specific index: " + list);
    }

    public static void addMultipleElements(List<String> list) {
        List<String> extra = Arrays.asList("Grapes", "Pineapple", "Papaya");
        list.addAll(extra);
        System.out.println("After adding multiple elements: " + list);
    }

    public static void accessElements(List<String> list) {
        System.out.println("First element: " + list.get(0));
        System.out.println("Third element: " + list.get(2));
    }

    public static void updateElements(List<String> list) {
        list.set(2, "Kiwi");
        System.out.println("After updating element: " + list);
    }

    public static void removeElements(List<String> list) {
        list.remove("Banana");
        list.remove(0);
        System.out.println("After removing elements: " + list);
    }

    public static void searchElements(List<String> list) {
        System.out.println("Contains Orange? " + list.contains("Orange"));
        System.out.println("Contains Kiwi? " + list.contains("Kiwi"));
    }

    public static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    public static void iterateList(List<String> list) {
        System.out.println("Iterating using for-each:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void useIterator(List<String> list) {
        System.out.println("Using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

    public static void subListDemo(List<String> list) {
        if (list.size() >= 3) {
            System.out.println("Sublist (0 to 2): " + list.subList(0, 2));
        }
    }

    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("After clearing: " + list);
    }

    public static void main(String[] args) {
        System.out.println("=== ArrayList Demo ===");
        List<String> arrayList = new ArrayList<>();
        performAll(arrayList);

        System.out.println("\n=== LinkedList Demo ===");
        List<String> linkedList = new LinkedList<>();
        performAll(linkedList);
    }

    public static void performAll(List<String> list) {
        addElements(list);
        addElementAtIndex(list);
        addMultipleElements(list);
        accessElements(list);
        updateElements(list);
        removeElements(list);
        searchElements(list);
        listSize(list);
        iterateList(list);
        useIterator(list);
        sortList(list);
        subListDemo(list);
        clearList(list);
    }
}