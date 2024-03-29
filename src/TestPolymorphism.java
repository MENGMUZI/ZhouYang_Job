import java.util.Random;

/**
 * @author : mengmuzi
 * create at:  2019-07-06  14:20
 * @description: 多态
 */
interface Animal{
    public void eat();
}

class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("dog eat bone --- 111");
    }
}

class Cat implements Animal{
    @Override
    public void eat(){
        System.out.println("cat eat fish---222");
    }
}

class Sheep implements Animal{
    @Override
    public void eat(){
        System.out.println("sheep eat grass---333");
    }
}

public class TestPolymorphism{
    public static Animal getInstance(int key){
        Animal result = null;

        switch (key){
            case 0:result = new Dog(); break;
            case 1:result = new Cat(); break;
            case 2:result = new Sheep(); break;
        }
        return result;
    }

    public static void main(String[] args) {

        Animal animal = TestPolymorphism.getInstance(new Random().nextInt(3));

        animal.eat();
    }
}

