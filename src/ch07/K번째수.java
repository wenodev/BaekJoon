package ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class K번째수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());


        List<Integer> numberList = new ArrayList<>();
        for (int i=0; i<N; i++){
            int temp = Integer.parseInt(br.readLine());
            numberList.add(temp);
        }

        Collections.sort(numberList);

        System.out.println(numberList.get(K-1));





    }
}
