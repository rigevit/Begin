/**
 * Created by veles on 05.02.2016.
 */
public class MethodCall {
    public static void main (String args[]) {
        //       System.out.println(min(1, 2));

        int a = 10;
        int b = 12;
        int y = min(a, b);
        System.out.print(y);
    }

    public static int min(int c, int d) {
        int x;
        if (c < d)
            x = c;
        else x = d;
        return x;
    }

}
