package weno.basic.recursive;

public class Fibonacci {

    public static int fibonacci(int number){

        System.out.println("number :" + number);

        if (number == 1) return 1;
        else if (number == 2) return 1;
        else return fibonacci(number-2) + fibonacci(number-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

}
