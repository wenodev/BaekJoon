package weno;

public class TreeTest {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node("jjj");

        node1.makeLeftSubTree(node2);
        node1.makeRightSubTree(node3);
        node2.makeLeftSubTree(node4);

        System.out.println("노드 1의 왼쪽 자식 노드 : " + node1.getLeftSubTree().getData());

    }




}
