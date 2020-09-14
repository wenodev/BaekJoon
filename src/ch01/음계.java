package ch01;

import java.util.Scanner;

public class 음계 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[] x = new int[8];
        int[] flag = new int[2];
        for (int i=0; i<x.length; i++){
            System.out.print("요소 입력 : ");
            x[i] = stdIn.nextInt();
        }

        for(int i=1; i<x.length; i++){
            if(x[i-1] < x[i]){
                flag[0]++;
            }else if(x[i-1] > x[i]){
                flag[1]++;
            }
        }

        if (flag[0] == 7){
            System.out.println("ascending");
        }else if (flag[1] == 7){
            System.out.println("descending");

        }else{
            System.out.println("mixed");
        }

    }
}
