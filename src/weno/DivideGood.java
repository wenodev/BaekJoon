package weno;

import java.util.ArrayList;
import java.util.Collections;

public class DivideGood {

    public static int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

        if (list.size() == 0){
            return new int[]{-1};
        }


        Collections.sort(list);
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        System.out.println(list);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;
        solution(arr, divisor);
    }
}
