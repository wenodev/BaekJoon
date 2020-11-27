package weno.algorithm;

public class QuickCopy {

    public static int partition(int[] array, int left, int right) {

        int mid = (left + right) / 2;
        swap(array, left, mid);

        System.out.println("========");
        for (int v : array) {
            System.out.print(v + " ");
        }

        int pivot = array[left];
        System.out.println("=========");
        System.out.println("pivot : " + pivot);

        int i = left, j = right;
        System.out.println("i : " + i);
        System.out.println("j : " + j);

        while (i < j) {
            while (pivot < array[j]) {
                j--;
            }
            while (i < j && pivot >= array[i]) {
                i++;
            }
            swap(array, i, j);
        }
        array[left] = array[i];
        array[i] = pivot;
        return i;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pi = partition(array, left, right);
        System.out.println("pi : " + pi);

        quickSort(array, left, pi - 1);
        quickSort(array, pi + 1, right);
    }


    public static void main(String[] args) {
        int[] array = { 80, 20, 60, 50, 40, 30, 70 };
        quickSort(array, 0, array.length - 1);

        for (int v : array) {
            System.out.print(v + " ");
        }

    }

}
