import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give your name : ");
        String name = sc.next();
        System.out.println(name);

        System.out.println("Give your address : ");
        String add = sc.nextLine(); // for a sentence
        System.out.println(add);

        System.out.println("Give Integer : ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.println("Give Float");
        float f = sc.nextFloat();
        System.out.println(f);
    }
}
