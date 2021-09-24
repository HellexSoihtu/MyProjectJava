package school.lesson4;

import java.util.Scanner;

public class Cat extends Animal {
    @Override
   public void running() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние: ");
        int chosenDistance = sc.nextInt();
        if (chosenDistance < 200 && chosenDistance > 0) {
            System.out.println("Бег: кот пробежал " + chosenDistance + " м");
        }
        else {
            System.out.println("Бег: кот не может бегать больше " + chosenDistance + " м");
        }
    }
    @Override
   public void swimming() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Плавание: кот не может плавать");
    }
}
