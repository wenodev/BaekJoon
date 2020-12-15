package weno;

public class TwoNumberSum {

    public static long solution(int a, int b) {
        long answer = 0;
        int n1, n2;

        if (a > b){
            n1 = a;
            n2 = b;
        }else{
            n1 = b;
            n2 = a;
        }

        for (int i = n2; i <= n1; i++) {
            answer += i;
        }

        return answer;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(solution(a,b));
    }
}
