import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Brock");
        System.out.println(sb.charAt(0)); // op => B

        sb.setCharAt(0, 'C');
        System.out.println(sb); // op => Crock

        sb.insert(2, 'p'); // inserts 'p' at index 2 in sb
        System.out.println(sb); // op => Crpock

        sb.delete(1, 3); // deletes characters from index 1 to 2 i.e. [1,3) from sb
        System.out.println(sb); // op => Cock

        sb.append('y');
        System.out.println(sb); // op => Cocky

        sb.append("ish");
        System.out.println(sb); // op => Cockyish

        System.out.println(sb.length()); // op => 8

        sb.reverse();
        System.out.println(sb); // op => hsiykcoC

    }
}
