package weno.algorithm;

public class Insertion {

    public static void insertionSort(int[] data){

        int temp;
        int j;

        for (int i = 1; i < data.length; i++) {
            temp = data[i];
            for (j = i-1; j>=0 && data[j] > temp; j--) {
                data[j+1] = data[j];
            }
            data[j+1] = temp;

            for (int k = 0; k < data.length; k++) {
                System.out.print(data[k] + " ");
            }
            System.out.println(" ");

        }

    }


    public static void main(String[] args) {

        int [] data = {10, 2, 6, 4, 3, 7, 5};
        insertionSort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }


    }

}
