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
        //char hello world;
        //Логічні значення boolean
        boolean j;
        boolean k;

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
