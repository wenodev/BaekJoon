package weno;

/*
ocean 이라는 행렬이 주어지고 0은 물을 1은 육지를 뜯한다.
총 몇개의 섬이 있는가?
주어진 행렬의 섬의 갯수는 3개이다.
 */

public class WenoTest {
    public static void main(String[] args) {
        int[][] ocean = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1}
        };
        System.out.println(solution(ocean));
    }

    public static int solution(int[][] street) {
        int answer = 0;
        /*  구현 */
        return answer;
    }
}
