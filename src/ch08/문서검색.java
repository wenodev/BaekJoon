package ch08;

import java.util.Scanner;

public class 문서검색 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();

        int firstLength = firstString.length();
        int secondLength = secondString.length();

        int idx = 0;
        int count=0;

        while(firstLength - idx >= secondLength) {
            if (firstString.substring(idx, idx + secondLength).equals(secondString)) {
                count++;
                idx += secondLength;
            } else {
                idx++;
            }
        }

        System.out.println(count);

    }
}
