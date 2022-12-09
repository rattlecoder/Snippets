import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {

        // Only classes are stored in this not normal variables

        // declare Arraylist
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Float> f1 = new ArrayList<Float>();
        ArrayList<String> s1 = new ArrayList<String>();
        ArrayList<Boolean> b1 = new ArrayList<Boolean>();

        // add elements
        a1.add(1);
        a1.add(2);
        a1.add(3);
        System.out.println(a1); // op => [1,2,3]

        // get elements
        int x = a1.get(0); // element at index 1
        System.out.println(x); // op => 1

        // add element to a given index
        a1.add(1, 6);
        System.out.println(a1); // op => [1,6,2,3]

        // set element
        a1.set(1, 7);
        System.out.println(a1); // op => [1,7,2,3]

        // remove element
        a1.remove(3); // deletes element at index 3
        System.out.println(a1); // op => [1,7,2]

        // size
        System.out.println(a1.size()); // op => 3

        // sort ArrayList
        Collections.sort(a1);
        System.out.println(a1); // op => [1,2,7]

        // reverse ArrayList
        Collections.reverse(a1);
        System.out.println(a1); // op => [7,2,1]
    }
}
