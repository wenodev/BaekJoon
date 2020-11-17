package ch08;

import java.util.Scanner;

public class 문서검색_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String word = sc.nextLine();

        int result = 0;
        int index = 0;

        while ( word.length() <= document.length() - index){

            if (document.substring( index, index + word.length()).equals(word)){
                index += word.length();
                result++;
            }else{
                index++;
            }
        }
        System.out.println(result);
    }
}
