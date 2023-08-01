//package com.company;

public class Effat2 {

    public static void main(String[] args) {

        int n= 0;
        int Array_1[] = new int[] {1, 2, 3, 4};
        int Array_2[] = new int[] {5, 2, 3, 5, 9};
        int Array_3[] = new int[Array_2.length];

            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 5; j++) {
                    if(Array_1[i] == Array_2[j]) {
                        Array_3[n] = Array_1[i];
                        n++;
                    }
                }
            }
            if(n > 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(Array_3[i] + " ");
                }
            }
            else {
                System.out.print("No Common Elements");
            }

    }

}