/**
 * @author : mengmuzi
 * create at:  2019-07-06  15:05
 * @description: 类加载的顺序
 */

class Father{
    public Father(){
        System.out.println("11111");
    }
    {
        System.out.println("22222");
    }
    static {
        System.out.println("33333");
    }
}

class Son extends Father{
    public Son(){
        System.out.println("44444");
    }
    {
        System.out.println("55555");
    }
    static {
        System.out.println("66666");
    }
}
public class TestStaticSeq {

    public static void main(String[] args) {
        new Son(); // 3 6 2 1 5 4
        System.out.println("----------");
        new Son(); // 2 1 5 4
        System.out.println("----------");
        new Father(); // 2 1
    }

}
