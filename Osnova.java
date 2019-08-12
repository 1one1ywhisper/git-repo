//Пункт 1
public class lesson1 {
    public static void main(String[] args) {
    }
    // Пункт 2
    public static void paragraph2 () {
        byte a = 10;
        short b = 5;
        int c = 102;
        long d = 95L;
        float e = 15.6f;
        double f = 25.3;
        boolean g = true;
        char h = 'C';
        String i = "Hello";
    }
    //Пункт 3
    public static float paragraph3 (float a, float b, float c, float d) {
        return a * (b + (c / d));
    /
//Пункт 4
        public static boolean paragraph4 (float x, float y) {
            return (x+y)>10 && (x+y)<20;
    /
//Пункт 5
            public static void paragraph5 (int x) {
                if (x>=0) {
                    System.out.println("Число положительное");
                } else {
                    System.out.println("число отрицательное");
                }
                либо System.out.println(a<0 ? "отрицательное" : "положительное");
            }
//Пункт 6
    *public static boolean paragraph6 (int x) {
                return x<0;
            }
//Пункт 7
    *public static void paragraph7 (String name) {
                System.out.println("Привет, " + name + "!");
            }
//Пункт 8
            public static void paragraph8 (int year) {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println(year + " год - високосный");
                } else {
                    System.out.println(year + " год - не високосный");
                }
            }
        }
// Пункт 9
// это две разных сигнатуры одного метода

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