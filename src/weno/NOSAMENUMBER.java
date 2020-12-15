package weno;

import java.util.ArrayList;

public class NOSAMENUMBER {

    public static int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }



    public static void main(String[] args) {
        int arr[] = new int[]{1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }

}
