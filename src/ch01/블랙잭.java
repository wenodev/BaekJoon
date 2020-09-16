package ch01;

import java.util.Scanner;

public class 블랙잭 {

    public static void main(String[] args) {

        Scanner stdId = new Scanner(System.in);

        int num = stdId.nextInt();
        int blackNum = stdId.nextInt();
        int max = 0;
        int sum = 0;

        int[] data = new int[num];

        for(int i=0; i<num; i++){
            data[i] = stdId.nextInt();
        }

        for(int i=0; i<num; i++){
            for(int j = i+1; j<num; j++){
                for(int k=j+1; k<num; k++){
                    sum = data[i] + data[j] + data[k];
                    if( sum <= blackNum){
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println( max);
    }
}
