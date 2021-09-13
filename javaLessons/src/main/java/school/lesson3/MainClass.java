package school.lesson3;
// задание
// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// 2. Конструктор класса должен заполнять эти поля при создании объекта.
// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
// 4. Создать массив из 5 сотрудников.
// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class MainClass
{
    // массив из 5 сотрудников, сортировка по возрасту, вывод в консоль информации
    public static void main(String[] args) {
        Employee[] emplUser = new Employee[5];
        emplUser[0] = new Employee("Кедрова Елена Владимировна", "тестировщик", "soihtu@mail.ru", "8384883",2500,27);
        emplUser[1] = new Employee("Гарбузов Евгений Юрьевич", "инженер-поверитель", "rimestorm@mail.ru", "6522537",5000,32);
        emplUser[2] = new Employee("Кедрова Татьяна Владимировна", "фронтендер", "baletro@mail.ru", "5834682",3000,33);
        emplUser[3] = new Employee("Баевич Станислав Александрович", "фронтендер", "satanislav@yandex.ru", "5312794",10000,43);
        emplUser[4] = new Employee("Кузьмичев Андрей Александрович", "бэкендер", "draven@gmail.com", "8231237",10000,44);
        for (Employee employee : emplUser)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}  // создание класса "Сотрудник"
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

   // создание конструктора класса
    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {      // возврат значения возраста
        return age;
    }
    @Override                  // переопределение
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}
