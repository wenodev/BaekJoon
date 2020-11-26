package weno.test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");

        System.out.println(list);

        list.clear();

        System.out.println(list);



    }


}
