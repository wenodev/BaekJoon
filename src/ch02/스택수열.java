package ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();
        int count = 1;
        int[] data = new int[num];

        Stack<Integer> stack = new Stack<>();
        List<Character> answerList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            data[i] = stdIn.nextInt();
        }

        for (int i = 0; i < num; i++) {

            while (count <= data[i]) {
                stack.push(count);
                count++;
                answerList.add('+');
            }

            if (stack.peek() == data[i]){
                stack.pop();
                answerList.add('-');
            }else{
                System.out.println("NO");
                return;
            }
        }
        answerList.forEach(n -> System.out.println(n));

    }
}
