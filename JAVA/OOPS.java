import java.util.*;

class Pen {
    String color;
    String type;

    // non - parameterized constructor
    Pen() {
        System.out.println("Constructor called for Pen class");
    }

    public void print() {
        System.out.println("Printed");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    // non - parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.print(this.name + " ");
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {

        Pen pen1 = new Pen(); // op => Constructor called for Pen class
        Pen pen2 = new Pen(); // op => Constructor called for Pen class
        pen1.color = "Blue";
        pen2.color = "Black";
        pen1.type = "Jel";
        pen2.type = "BallPoint";
        pen1.print(); // op => Printed
        pen1.printColor(); // op => Blue
        pen2.printColor(); // op => Black

        Student stu1 = new Student("Brock", 29);
        stu1.printInfo(); // op => Brock 29

    }
}
