package weno.algorithm;

public class Selection {

    public static void insertion_sort(int[] data){
        int temp;
        for (int i = 0; i < data.length-1; i++) {

            for (int j = i+1; j < data.length; j++) {
                if (data[i] > data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] data = {8, 5, 6, 2, 4};
        insertion_sort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
