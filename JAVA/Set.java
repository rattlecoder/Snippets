import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<Integer>();
        st.add(11);
        st.add(22);
        st.add(33);
        st.add(33);
        System.out.println(st); // op => [33,11,22]

        if (st.contains(11)) {
            System.out.println("Yes"); // op => Yes
        }
        if (!st.contains(25)) {
            System.out.println("No"); // op => No
        }

        st.remove(11);
        if (!st.contains(11)) {
            System.out.println("No"); // op => No
        }
        st.add(11);

        System.out.println(st.size()); // op => 3

        // printing set elements line by line
        Iterator it = st.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
