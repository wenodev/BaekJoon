package 아무코드;

public class 다형성 {

    static class Super{
        int x = 100;
        int y = 200;

        Super(){
            System.out.println(this.x);
            System.out.println(this.y);
        }

        void print(){
            System.out.println("부모클래스");
        }

    }

    static class Child extends Super {
        int j = 1000;
        int z = 2000;

        Child(){
            System.out.println(this.j);
            System.out.println(this.z);
        }

        void print(){
            System.out.println("자식클래스");
        }

    }

    public static void main(String[] args) {
        Super sp = new Super();
        Child ch = new Child();
        Super sp1 = new Child();

        sp1.print();
        System.out.println(sp1.x + sp1.y);

    }

}
