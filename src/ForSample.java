/**
 * Created by veles on 29.01.2016.
 */
public class ForSample {
    public static void main (String[] args){
        int x;
        int a, b;
        b = 10;

        for (x = 0; x<15; x++)
            System.out.println("Value x is equal to: " + x);

        for (a=0; a<10; a++) {
            System.out.println("Значення a: " + a);
            System.out.println("Значення b: " + b);
            b = b - 2;
        }
    }
}
