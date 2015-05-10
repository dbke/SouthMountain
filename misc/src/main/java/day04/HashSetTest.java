package day04;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by Administrator on 2015/5/10.
 */
public class HashSetTest {
    public static void main(String[] args){
        HashSet hs = new LinkedHashSet();
        //存储元素时判断hashCode 是否相同 若相同 再判断equals，
        // 这里要覆盖hashCode和equals方法
        hs.add(new Person("abcd1",20));
        hs.add(new Person("abcd1",20));
        hs.add(new Person("abcd1",21));
        hs.add(new Person("abcd1",22));
        System.out.print(hs);


    }
}
