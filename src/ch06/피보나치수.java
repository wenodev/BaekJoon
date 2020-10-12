package ch06;

import java.util.Scanner;

public class 피보나치수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();

        int n1 = 0;
        int n2= 1;

        while (max > 0){
            int temp = n1;
            n1 = n2;
            n2 = temp+n1;
            max--;
        }

        System.out.println(n1);

    }
}
