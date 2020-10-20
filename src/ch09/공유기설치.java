package ch09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 공유기설치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> data = new ArrayList<>();
        for (int i=0; i<n; i++){
            int temp = sc.nextInt();
            data.add(temp);
        }

        Collections.sort(data);

        int start = data.get(1) - data.get(0);
        int end = data.get(n-1) - data.get(0);
        int result = 0;


        while(start <= end){

            int mid = (start + end) / 2;
            int value = data.get(0);
            int cnt = 1;

            for (int i=1; i<n; i++){
                if (data.get(i) >= value + mid ){
                    value = data.get(i);
                    cnt++;
                }
            }

            if (cnt >= c){
                start = mid + 1;
                result = mid;
            }else{
                end = mid - 1;
            }
        }


        System.out.println(result);
    }
}
