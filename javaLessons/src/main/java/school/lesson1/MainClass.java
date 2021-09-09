package school.lesson1;

public class MainClass
{
    // задание 1
    // Создайте метод printThreeWords(),
    // который при вызове должен отпечатать в столбец три слова:
    // Orange, Banana, Apple.

    public static void printThreeWords()
    {
        System.out.println("Orange"); // вывести слово "Orange"
        System.out.println("Banana"); // вывести слово "Banana"
        System.out.println("Apple");  // вывести слово "Apple"
    }
    // задание 2
    // Создайте метод checkSumSign(), объявите две переменные a и b (любые значения)
    // Просуммируйте их, если сумма будет больше или равна 0,
    // то выведите сообщение "Сумма положительная",
    // в противном случае - "Сумма отрицательная".

    public static void checkSumSign()
    {
        int a = 15; // объявление переменной a (значение а = 15)
        int b = 33; // объявление переменной b (значение b = 33)
        int c = a + b; // // объявление переменной c (значение c = сумма a и b)
        if (c >= 0) // если с >=0
        {
            System.out.println("Сумма положительная");
        }
        else // если с <0
        {
            System.out.println("сумма отрицательная");
        }
    }

    // задание 3
    // Создайте метод printColor(), задайте переменную int value (любое значение),
    // если value <=0, то вывести сообщение "Красный",
    // если value >0 и value <=100, то вывести сообщение "Желтый",
    // если value > 100, то вывести сообщение "Зеленый"

    public static void printColor()
    {
        int value = 158; // объявление переменной value (значение value = 158)
        if (value <= 0)  // если value <=0
        {
            System.out.println("Красный"); // вывести значение "Красный"
        }

        if (value > 0 && value <= 100) // если value > 0 и <=100
        {
            System.out.println("Желтый"); // вывести значение "Желтый"
        }

        if (value > 100)  // если value > 100
        {
            System.out.println("Зеленый"); // вывести значение "Зеленый"
        }
    }

    // задание 4
    // Создайте метод compareNumbers(), объявите две int переменные a и b (любые значения),
    // если a >= b, то вывести сообщение “a >= b”,
    // в противном случае “a < b”

    public static void compareNumbers()
    {
        int a = 48; // объявление переменной a (значение а = 48)
        int b = -39; // объявление переменной b (значение b = -39)
        if (a >= b) // если a >= b
        {
            System.out.println("a >= b"); // вывести запись "a >= b"
        }
        else                              // если a < b
            System.out.println("a < b");  // вывести запись "a < b"
    }
    public static void main(String[] args)
    {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}

