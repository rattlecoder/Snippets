public class Casting {
    public static void main(String[] args) {
        double price = 100.1;
        double price2 = price + 10; // implicit casting
        System.out.println(price2); // op => 110.1
        int i = 10;
        int i2 = i + (int) 5.7; // explicit casting
        System.out.println(i2); // op => 15
    }
}
