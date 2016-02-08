import java.io.*;
import static java.lang.Integer.parseInt;

public class Example
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String sName1 = reader.readLine ();
        String sName2 = reader.readLine ();
        String sName3 = reader.readLine ();
        System.out.print (sName1 + " " + sName2 + " " + sName3 + " = Чистая любовь, да-да!");
    }
}