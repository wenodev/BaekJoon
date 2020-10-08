package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] numberArray = new int[10001];

        for (int i=1; i<count+1; i++){
            int temp = Integer.parseInt(br.readLine());
            numberArray[temp] += 1;
        }

        StringBuilder result = new StringBuilder();

        for (int i=1; i<10001; i++){
            if (numberArray[i] != 0){
                for (int j=1; j<numberArray[i]+1; j++){
                    result.append(i).append("\n");
                }
            }
        }

        System.out.println(result);

    }
}
