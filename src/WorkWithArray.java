//commit by veles
public class WorkWithArray {

    public static void main(String[] args) {

        int array[] = new int[3];
        array[0] = 1000;

        growArray(array);
        showArray(array);
        reverceWithXOR(array);
        showArray(array);

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

