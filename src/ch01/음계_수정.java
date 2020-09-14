package ch01;

import java.util.Scanner;

public class 음계_수정 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[] data = new int[8];
        boolean ascending = true;
        boolean descending = true;

        for (int i=0; i<data.length; i++){
            data[i] = stdIn.nextInt();
        }

        for (int i=1; i<data.length; i++){
            if (data[i-1] < data[i]){
                descending = false;
            }else if (data[i-1] > data[i]){
                ascending = false;
            }
        }

        if(ascending) System.out.println("ascending");
        else if(descending) System.out.println("descending");
        else System.out.println("mixed");

    }
}
