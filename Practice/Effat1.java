public class Effat1 {

    public static void main(String[] args) {

        int Array_1[] = new int[] {10, 20, 30, 40, 50};
        int Array_2[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int Array_3[] = new int[Array_1.length + Array_2.length];

//        System.out.print(Array_3.length);
//        System.out.print(Array_2.length);
//        System.out.print(Array_1.length);


        for (int i = 0; i < Array_1.length; i++) {
            Array_3[i] = Array_1[i];
        }

        for (int i = Array_1.length, j = 0; i < Array_3.length; i++, j++) {
            Array_3[i] = Array_2[j];
        }

        for (int i = Array_3.length - 1; i >= 0; i--) {
            System.out.print(Array_3[i] + " ");
        }

    }

}