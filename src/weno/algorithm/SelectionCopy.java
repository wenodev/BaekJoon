package weno.algorithm;

public class SelectionCopy {

    public static void selectionSort(int[] data){

        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i] > data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

    }


    public static void main(String[] args) {
        int[] data = {8, 5, 6, 2, 4};
        selectionSort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
