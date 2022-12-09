import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();

        l1.addFirst("a");
        l1.addFirst("is");
        System.out.println(l1); // op => [is,a]

        l1.addFirst("This");
        l1.add("String");
        System.out.println(l1); // op => [This, is, a, String]

        System.out.println(l1.size()); // op => 4

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + "->");
        }
        System.out.println("NULL"); // op => This->is->a->String->NULL

        l1.removeFirst();
        System.out.println(l1); // op => [is,a,String]

        l1.removeLast();
        System.out.println(l1); // op => [is,a]

        l1.remove(1); // removes from index 1
        System.out.println(l1); // op => [is]
    }
}
