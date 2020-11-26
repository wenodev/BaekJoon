package weno.test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

    public static void main(String[] args) {

        int [] array1 = {1,2,3,4,5};

        for(int i : array1){
            System.out.print(i +" ");
        }
        System.out.println();

        int [] array2 = Arrays.copyOf(array1, 3); //Arrays.copyOf

        for(int i : array2){
            System.out.print(i +" ");
        }

        System.out.println(" ");

        array1[0] = 0;


        for(int i : array1){
            System.out.print(i +" ");
        }
        System.out.println(" ");

        for(int i : array2){
            System.out.print(i +" ");
        }




    }

}
