import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st + " Size = " + st.size()); // op => [1, 2, 3] Size = 3

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
