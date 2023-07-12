package Семинар_6;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping Zzz...");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Whiskers", 3, "Gray");
        Cat cat2 = new Cat("Smokey", 5, "Black");

        System.out.println("Cat 1:");
        System.out.println("Name: " + cat1.getName());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        cat1.meow();
        cat1.sleep();

        System.out.println();

        System.out.println("Cat 2:");
        System.out.println("Name: " + cat2.getName());
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());
        cat2.meow();
        cat2.sleep();
    }
}
