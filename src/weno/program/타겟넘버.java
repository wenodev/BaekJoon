package weno.program;

public class 타겟넘버 {

    public static int dfs(int[] numbers, int n, int sum, int target){
        if (n == numbers.length){
            if (sum == target) return 1;
            return 0;
        }

        return dfs(numbers, n+1, sum + numbers[n], target) + dfs(numbers, n+1, sum-numbers[n], target);
    }

    public static int solution(int[] numbers, int target) {
        int answer = dfs(numbers, 0, 0, target);
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        solution(numbers, target);

        int n1 = 10;
        int n2 = 20;


        while(true){
            System.out.println(n1++ + " test case " + n2++*2);
            try {
                Thread.sleep(1000); //1초 대기

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
