package weno.test;

import java.util.ArrayList;
import java.util.Random;

public class MaxOfArray {

    public static int maxOf(int[] height){
        int max = height[0];
        for (int i = 0; i < height.length; i++) {
            if (max < height[i]) max = height[i];
        }

        return max;
    }


    public static void main(String[] args) {
        Random random = new Random();

        int SIZE = 1+ random.nextInt(20);
        int[] height = new int[SIZE];

        for (int i = 0; i < height.length; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println(i + " 번째 height = " + height[i]);
        }
        System.out.println(maxOf(height));

    }
}
