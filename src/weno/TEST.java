package weno;

public class TEST {

    static class Node{

        int value;
        Node leftNode;
        Node rightNode;

        public int getValue() {
            return this.value;
        }

        Node(int value){
            this.value = value;
            this.leftNode = null;
            this.rightNode = null;
        }

        public boolean isTerminal(){
            return this.leftNode == null && this.rightNode == null ? true : false;
        }

        public void setNode(int value, Node node){
            if (!node.isTerminal()){
                setNode(value, node.leftNode);
                setNode(value, node.rightNode);
            }else{
                node.leftNode = new Node(node.getValue() - value);
                node.rightNode = new Node(node.getValue() + value);
            }
        }

        public int countValue(Node node, int target){

            if (!node.isTerminal()){
                return countValue(node.leftNode, target) + countValue(node.rightNode, target);
            }else{
                if (node.getValue() == target) return 1;
            }

            return 0;

        }

    }


    public static int solution(int[] numbers, int target){
        int answer = 0;
        Node node = new Node(0);

        for (int i = 0; i < numbers.length; i++) {
            node.setNode(numbers[i], node);
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
