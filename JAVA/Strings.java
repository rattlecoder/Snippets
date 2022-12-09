public class Strings {
    public static void main(String[] args) {
        // concatenation
        String a = "Brock";
        String b = "Lesnar";
        String concatenatedString = a + " and " + b;
        System.out.println(concatenatedString); // op => Brock and Lesnar
        // charAt
        char ch = a.charAt(0); // gets character of String a at index 0
        System.out.println(ch); // op => B
        // length
        System.out.println(a.length()); // op => 5
        // replace
        String c = a.replace('B', 'C');
        System.out.println(c); // op => Crock
        // substring
        System.out.println(a.substring(0, 4)); // index=[0,4) // op => Broc
    }
}
