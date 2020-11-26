package weno.program;

public class 타겟넘버 {

    static int count;

    public static int dfs(int[] numbers, int n, int sum, int target){
        count += 1;
        System.out.println("==============");
        System.out.println("count : " + count);
        System.out.println("n : " + n);
        System.out.println("sum : " + sum);
        System.out.println("numbers.length : " + numbers.length);

        if (n == numbers.length){
            if (sum == target){
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }

    public static int solution(int[] numbers, int target) {
        int answer;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

}
