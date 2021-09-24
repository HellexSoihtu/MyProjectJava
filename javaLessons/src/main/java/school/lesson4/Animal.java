package school.lesson4;
import java.util.Scanner;

public class Animal {
    static int count = 0;
    int chosenDistance;

    public Animal() {
        count++;
    }
    public void run() {
        Scanner sc = new Scanner(System.in);
        int chosenDistance = sc.nextInt();
    }
    public void swim() {
        Scanner sc = new Scanner(System.in);
        int chosenDistance = sc.nextInt();
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.swim();

        Dog dog = new Dog();
        dog.run();
        dog.swim();

        Animal animal = new Animal();
        System.out.println("Всего животных: " + count);
    }
}