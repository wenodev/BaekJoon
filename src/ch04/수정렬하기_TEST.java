package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;



/*

1. 입력을 받을때는 BufferedReader를 사용하는 습관을 들이자
2. 정렬을 할때는 TreeSet보단 List형태로 받은 뒤 Collectinons.sort() 를 사용하는 것이 더 효율적이다.

 */


public class 수정렬하기_TEST {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        Set<Integer> set = new TreeSet<>();

        for (int i=0; i<count; i++){
            int temp = Integer.parseInt(br.readLine());
            set.add(temp);
        }

        set.forEach(n->{
            System.out.print(n + " ");
        });

    }

}
