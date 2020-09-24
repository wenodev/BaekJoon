package ch04;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 수정렬하기_TEST {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();


        Set<Integer> set = new TreeSet<>();

        for (int i=0; i<count; i++){
            int temp = sc.nextInt();
            set.add(temp);
        }

        set.forEach(n->{
            System.out.print(n + " ");
        });


    }

}
