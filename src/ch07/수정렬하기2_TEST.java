package ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수정렬하기2_TEST {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());


        List<Integer> integerList = new ArrayList<>();

        for (int i=0; i<max; i++){
            int temp = Integer.parseInt(br.readLine());
            integerList.add(temp);
        }

        Collections.sort(integerList);

//        integerList.forEach(n -> {
//            System.out.println(n);
//        });

        for (int n : integerList){
            System.out.println(n);
        }

    }
}
