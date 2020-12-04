package weno.program;

public class 타겟넘버2 {

    static class Node
    {
        private int value;
        private Node rightNode ;   //+ 노드
        private Node leftNode ;    //- 노드

        public Node() {
            value=0;
        }

        public Node(int value)
        {
            this.value =value;
            this.rightNode = null;
            this.leftNode = null;
        }
        /*
         * 다음 depth의 노드를 셋팅 한다.
         * 현재 노드가 leaf 노드면 다음 노드를 셋팅 한다.
         */
        public void setNode(Node node,int val) {
            if(!node.isTerminal()) {
                setNode(node.leftNode,val);
                setNode(node.rightNode,val);
            }
            else {
                node.leftNode = new Node(node.getValue() - val);
                node.rightNode = new Node(node.getValue() + val);
            }
        }

        public boolean isTerminal() {
            return this.rightNode==null && this.leftNode==null ? true : false;
        }

        public int countValue(Node node,int target) {


            if(!node.isTerminal()) {
                return countValue(node.leftNode, target) +countValue(node.rightNode, target);
            }
            else {
                if(node.getValue() == target) {
                    return 1;
                }
            }
            return 0;

        }

        public int getValue() {
            return this.value;
        }

    }


    public static int solution(int[] numbers, int target){
        int answer = 0;
        Node node = new Node(0);  // 초기 값 0부터 시작

        for(int i=0; i<numbers.length; i++) {
            node.setNode(node, numbers[i]);
        }

        answer = node.countValue(node, target);

        return answer;
    }


    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(solution(numbers, target));

    }

}