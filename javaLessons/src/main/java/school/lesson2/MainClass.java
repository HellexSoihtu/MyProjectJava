package school.lesson2;

public class MainClass
{
    // задание 1
    // Создайте метод within10and20,
    // который принимает на вход два целых числа и проверяет,
    // что их сумма лежит в пределах от 10 до 20 (включительно):
    // если да – вернуть true, иначе – false.

    public static boolean within10and20(int a, int b)
    {
        int c = a + b; // объявление переменной c, которая равна сумме a и b
        if (c >= 10 && c <= 20)// если сумма лежит в пределах от 10 до 20 включительно
        {
            System.out.println("true");  // вывести true
            return true;
        }
        else                             // иначе
        {
            System.out.println("false"); // вывести false
            return false;
        }
    }

    // задание 2
    // Создайте метод isPositiveOrNegative,
    // который принимает в качестве параметра целое число
    // (0 считается положительным) и печатает в консоль,
    // положительное или отрицательное число передали.

    public static void isPositiveOrNegative(int a)
    {
        if (a >= 0)   // если a >=0
        {
            System.out.println("Результат положительный"); // вывести "Результат положительный"
        }
        else          // иначе
        {
            System.out.println("Результат отрицательный"); // вывести "Результат отрицательный"
        }
    }

    // задание 3
    // Создайте метод isNegative,
    // который принимает в качестве параметра целое число
    // и возвращает true, если положительное,
    // иначе - false
    public static boolean isNegativeOrPositive(int a)
    {
        if ( a>=0 )                      // если a >=0
        {
            System.out.println("true " + "Результат положительный");  // вывести true
            return true;
        }
        else                             // иначе
        {
            System.out.println("false " + "Результат отрицательный"); // вывести false
            return false;
        }
    }

    public static void main(String[] args)
    {     within10and20(30, -5);
          isPositiveOrNegative(14);
          isNegativeOrPositive(666);
    }
}

