package school.lesson4;
// задание
// 1. Создать классы Собака и Кот с наследованием от класса Животное.


abstract class Animal // создание класса Animal
{
    private final int runningDistance = 0; // объявление максимальной дистанции бега
    private final int swimmingDistance = 0; // объявление максимальной дистанции плавания

    abstract void running(int distance);    // метод бег
    abstract void swimming(int distance);   // метод плавание
}

class Cat extends Animal // создание класса Cat наследование от Animal
{
    private final int runningDistance = 200; // объявление максимальной дистанции бега
    @Override
    void running(int distance)               // метод бег
    {
        if ((distance >= 0) && (distance <= runningDistance))
            System.out.println("Бег: кот пробежал " + distance + " м");
        else System.out.println("Бег: кот не может бегать больше " + runningDistance + " м");
    }
    @Override
    void swimming(int distance)              // метод плавание
    {
        System.out.println("Плавание: кот не может плавать");
    }
}

class Dog extends Animal {               // создание класса Dog наследование от Animal
    private final int runningDistance = 500; // объявление максимальной дистанции бега
    private final int swimmingDistance = 10; // объявление максимальной дистанции плавания

    @Override
    void running(int distance)          // метод бег
    {
        if ((distance >= 0) && (distance <= runningDistance))
            System.out.println("Бег: собака пробежала " + distance + " м");
    }
    @Override
    void swimming(int distance)         // метод плавание
    {
        if ((distance >= 0) && (distance <= swimmingDistance))
            System.out.println("Плавание: собака проплыла " + distance + " м");
        else System.out.println("Плавание: собака не может плыть больше " + swimmingDistance + "м");
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.running(202);
        cat.swimming(1);

        Dog dog = new Dog();
        dog.running(500);
        dog.swimming(30);
    }
}