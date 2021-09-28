package school.lesson4;

import java.util.Scanner;

public class Dog extends Animal{
    @Override
    public void running() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние: ");
        int chosenDistance = sc.nextInt();
        if (chosenDistance < 500 && chosenDistance > 0) {
            System.out.println("Бег: собака пробежала " + chosenDistance + " м");
        }
        else {
            System.out.println("Бег: собака не может пробежать " + chosenDistance + " м");
        }
    }
    @Override
    public void swimming() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние: ");
        int chosenDistance = sc.nextInt();
        if (chosenDistance < 10 && chosenDistance > 0) {
            System.out.println("Плавание: собака проплыла " + chosenDistance + " м");
        }
        else {
            System.out.println("Плавание: собака не может плыть " + chosenDistance + " м");
        }
    }
}
