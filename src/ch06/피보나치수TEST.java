package ch06;

import java.util.Scanner;

public class 피보나치수TEST {

    public static int fibonacci(int max, int count, int num1, int num2){
        count++;
        if (count < max){
            return num1 + fibonacci(max, count, num2, num1+num2);
        }
        return 1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max  = sc.nextInt();
        System.out.println("fibonacci : " + fibonacci(max,0,0,1));

    }
}
