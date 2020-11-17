package ch08;

import java.util.Scanner;

public class 새_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int index = 1;
        int result = 0;

        while(num != 0){

            if (num < index){
                index = 1;
            }
            num -= index;
            index++;
            result++;
        }

        System.out.println(result);

    }
}
