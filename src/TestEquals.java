import java.util.HashSet;
import java.util.Set;

/**
 * @author : mengmuzi
 * create at:  2019-07-05  00:00
 * @description: equals 和 == 区别
 *
 * 1. == 既可以比较基本类型亦可以比较引用类型，对于基本类型就是比较值，对于引用类型就是比较内存地址
 * 2. Equals的话，它就属于java.lang.Object类里面的方法，如果该方法没有被重写过默认也是==；（String类的equals方法就是被重写过的）
 * 3. 具体要看有没有重写Object的hashCode方法和equals方法来判断
 *  原则: "相等的对象必须具有相等的散列码"
 */
public class TestEquals {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2));// true
        Set<String> set01 = new HashSet<>();
        set01.add(s1);
        set01.add(s2);
        System.out.println(s1.hashCode() + "\t" + s2.hashCode());// true
        System.out.println(set01.size());// 1


        System.out.println("====================================");


        Person p1 = new Person("abc");
        Person p2 = new Person("abc");
        System.out.println(p1 == p2);// false
        // 若Person类中没有重写equals方法为false，则默认的是Object中的equal方法等同于==，运行的结果是false/1639705018	1627674070/2
        //重写equals方法必须同时重写hashCode方法
        System.out.println(p1.equals(p2));
        Set<Person> set02 = new HashSet<>();
        set02.add(p1);
        set02.add(p2);
        System.out.println(p1.hashCode() + "\t" + p2.hashCode());// true
        System.out.println(set02.size());// 1


    }

}
