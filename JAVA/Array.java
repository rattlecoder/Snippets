import java.util.*; //  imports all the packages

public class Array {
    public static void main(String[] args) {
        // initialize
        int[] marks = new int[3]; // declare array marks of size 3
        marks[0] = 99;
        marks[1] = 97;
        marks[2] = 98;
        int[] marks2 = { 99, 99, 99, 98, 97, 98 };
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(mat[0][0]); // op => 1
        System.out.println(mat[1][1]); // op => 5
        System.out.println(marks[0]); // op => 99
        // length
        System.out.println(marks.length); // op => 3
        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]); // op => 97
    }
}
