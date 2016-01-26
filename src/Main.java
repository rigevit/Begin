public class Main {

    /*{3, 7, 13, 78, 2, 14, 67, 10}*/
    public static void main(String[] args) {




        int[] arraynext = new int[5];
        int add = 2;
        arraynext[0] = 1;
        for (int index = 1; index < arraynext.length; index++) {
            arraynext[index] = arraynext[index - 1] + add;
        }

//        for (int i = 0; i < arraynext.length; i++) {
//            System.out.println(arraynext[i]);
//        }
        showArray(arraynext);
    }

    public static void showArray(int[] array) {
        for (int anArray : array) {
            System.out.println(anArray);
        }
    }


}
