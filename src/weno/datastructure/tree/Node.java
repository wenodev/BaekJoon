package weno.datastructure.tree;

public class Node<T> {

    public Node left;
    public Node right;
    public T data;

    public Node(T data){
        this.data = data;
    }

    public void putLeft(Node node){
        this.left = node;
    }

    public void pufRight(Node node){
        this.right = node;
    }

    public Node getLeft(Node node){
        return this.left;
    }

    public Node getRight(Node node){
        return this.right;
    }





}
