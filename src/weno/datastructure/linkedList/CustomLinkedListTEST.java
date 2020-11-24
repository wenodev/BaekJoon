package weno.datastructure.linkedList;

public class CustomLinkedListTEST {


    public static void main(String[] args) {

        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addFirst("test1");
        customLinkedList.addFirst("test2");
        customLinkedList.addFirst("test3");
        customLinkedList.addFirst("test4");

        System.out.println(customLinkedList.head.data);
        System.out.println(customLinkedList.head.next.data);
        System.out.println("=====");
        customLinkedList.dump();

    }

}
