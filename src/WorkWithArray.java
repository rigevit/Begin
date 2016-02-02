//commit by veles
public class WorkWithArray {

    public static void main(String[] args) {

        int array[] = new int[3];
        array[0] = 1000;
        growArray(array);
        showArray(array);
        reverceWithXOR(array);
        showArray(array);

        String week[];
        week = new String[7];
        week [0] = "Monday";
        week [1] = "Tuesday";
        week [2] = "Wednesday";
        week [3] = "Thursday";
        week [4] = "Friday";
        week [5] = "Saturday";
        week [6] = "Sunday";

        System.out.println("Days off are " + week[5] + " and "+ week[6]);
    }

    public static void growArray (int[] array) {
        for (int index = 1; index < array.length; index++) {
            array[index] = array[index - 1] + 1;
        }
    }

    public static void showArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Елемент масиву " + i + ": " + array[i]);
        }
    }

    public static void reverceWithXOR (int[] array) {
        int length = array.length;
        int half = (int) Math.floor(array.length / 2);
        for (int i = 0; i < half; i++) {
            array[i] ^= array[length - i - 1];
            array[length - i - 1] ^= array[i];
            array[i] ^= array[length - i - 1];
        }
    }
}

