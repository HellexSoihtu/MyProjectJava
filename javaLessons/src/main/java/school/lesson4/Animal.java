package school.lesson4;
import java.util.Scanner;

public class Animal {
    static int count = 0;
    int chosenDistance;

    public Animal() {
        count++;
    }
    public void running() {
        Scanner sc = new Scanner(System.in);
        int chosenDistance = sc.nextInt();
    }
    public void swimming() {
        Scanner sc = new Scanner(System.in);
        int chosenDistance = sc.nextInt();
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.running();
        cat.swimming();

        Dog dog = new Dog();
        dog.running();
        dog.swimming();

        Animal animal = new Animal();
        animal.running();
        animal.swimming();
        System.out.println("Всего животных: " + count);
    }
}