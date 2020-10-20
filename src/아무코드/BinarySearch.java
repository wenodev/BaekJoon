package 아무코드;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,10,15,20,21};

        binarySearch(2, arr);

    }

    public static void binarySearch(int key, int arr[]){

        int mid;
        int left = 0;
        int right = arr.length -1;
        boolean flag = false;

        while (right >= left){

            mid = (right + left) / 2;

            if(key == arr[mid]){
                System.out.println(key + " is in the array with index value : " + mid);
                flag = true;
                break;
            }

            if (key <arr[mid]){
                right = mid -1;
            }else {
                left = mid + 1;
            }

        }

        if (!flag){
            System.out.println(key + " is not in the array");
        }

    }


}
