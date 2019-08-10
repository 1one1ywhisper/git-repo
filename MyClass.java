//1. Создать пустой проект в IntelliJ IDEA и прописать метод main()
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Задание 2 >");
        z2();
        System.out.println("Задание 3 > \na*(b+(c/d)) = " + z3(2,4,8,10));
        System.out.println("Задание 4 > \n"+z4(9, 11)+", если true - Число лежит в пределах 10-20, иначе - false");
        System.out.println("Задание 5 >");z5(-7);
        System.out.println("Задание 6> \n"+z6(-100)+", если true - Число - отрицательное, иначе- false");
        z7("Проверяющий");
        z8(2019);
    }

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения
    static void z2() {
        byte b = 1;
        short s = 100;
        char c = 'Z';
        int i = 666;
        long l = 121212L;
        float f = 100.0f;
        double d = 666.666;
        boolean boo = true;
        System.out.println("Тип byte = " + b);
        System.out.println("Тип short = " + s);
        System.out.println("Тип char = " + c);
        System.out.println("Тип int = " + i);
        System.out.println("Тип long = " + l);
        System.out.println("Тип float = " + f);
        System.out.println("Тип double = " + d);
        System.out.println("Тип boolean = " + boo);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные
    // параметры этого метода
    static double z3(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае – false;
    static boolean z4(int n1, int n2) {
        int sum = n1 + n2;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    static void z5(int number) {
        if (number >= 0) System.out.println("Число " + number + "является положительным");
        else System.out.println("Число " + number + " является отрицательным");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число
    // отрицательное;
    static boolean z6(int a) {
        if (a < 0) return true;
        else return false;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в
    // консоль сообщение «Привет, указанное_имя!»;
    static void z7(String name) {
        System.out.println("Задание 7>");
        System.out.println("Привет, " + name + "!");
    }

    //8. Написать метод, который определяет является ли год високосным, и выводит сообщениев консоль. Каждый 4-й год
    // является високосным, кроме каждого 100-го, при этом каждый 400-й– високосный.
    static void z8(int year) {
        System.out.println("Задание 8>");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный.");
    }
}