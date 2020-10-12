package ch06;

import java.util.Scanner;

public class Z {

    public static int N, X, Y, result = 0;

    public static void solve(int n, int x, int y){

        if (n == 2){

        }
        solve(n/2, x, y);



    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();
        solve((int) Math.pow(2, N), 0, 0);


    }

}
