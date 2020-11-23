package weno.algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        binarySearch(data, 10);
    }


    public static void binarySearch(int[] data, int key){
        int mid;
        int left = 0;
        int right = data.length - 1;
        boolean flag = false;

        while(left <= right){
            mid = (left + right) / 2;

            if (key == data[mid]){
                System.out.println("data is in " + mid + " index!" );
                flag = true;
                break;
            }else if(key < data[mid]){
                right = mid - 1;
            }else if(key > data[mid]){
                left = mid + 1;
            }
        }

        if (!flag){
            System.out.println("no data");
        }

    }





}
