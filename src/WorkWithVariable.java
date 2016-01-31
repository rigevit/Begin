/**
 * Created by veles on 29.01.2016.
 */
public class WorkWithVariable {
    public static void main (String[] args) {
        //цілі числа byte, short, int, long
        byte d;
        short e;
        int f;
        long g;
        //числа з плаваючою точкою float, double
        float h;
        double i;

        //Символи char
        char char1, char2;
        char1 = 88;
        char2 = 'a';
        System.out.println("Значення змінних: " + char1 + ", " + char2);
        //Збільшення символьних змінних
        char char3, char4;
        char3 = 'c';
        System.out.println("Значення змінної = " + char3);
        char3++;
        System.out.println("Після збільшення змінної на 1 = " + char3);
        char4 = (char) (char1 + char2);
        System.out.println("Змінна char4 = " + char4);

        //Логічні значення boolean
        boolean j;
        boolean k;

        //Підрахунок відстані, пройдених променями сонця за певну кількість днів
        long distance;
        long seconds;
        long days;
        int lightspeed;
        days = 20000;
        lightspeed = 300000000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * days;
        System.out.println("Світло за " + days + " днів пройде " + distance + " метрів.");

        //Підрахунок площі кола
        double pi, r, s;
        r = 34;
        pi = 3.14;
        s = pi * r * r;
        System.out.println("Площа кола дорівнює: " + s);

        int a, b;
        double c;
        a = 100;
        b = 123;
        c = a * b;
        System.out.println("Підрахунок значення с: " + c);
        c = c * 5;
        System.out.println("Множення значення с на 5: " + c);
        c = c / 513.6;
        System.out.print("Поділити значення с на 513.6: " + c);
    }
}
