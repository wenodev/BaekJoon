package ch08;

import java.util.Scanner;

public class 새 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = 1;
        int result = 0;

        while (N != 0){
            if (K > N)
                K = 1;
            N -= K;
            K++;
            result++;
            System.out.println("N : " + N);
        }
        System.out.println(result);

    }

}
