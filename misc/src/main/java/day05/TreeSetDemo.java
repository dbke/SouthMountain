package day05;

import java.util.TreeSet;

/**
 * Created by Administrator on 2015/5/10.
 */
public class TreeSetDemo {
    public static void main(String[] args){

        TreeSet ts =new TreeSet(new CompareByName());
        ts.add(new Person("abcd1",20));
        ts.add(new Person("abcd2",13));
        ts.add(new Person("abcd2",13));//怎么保证元素唯一的？用compareTo方法两个验证元素是否相同
        ts.add(new Person("abcd4",42));
        ts.add(new Person("abcd3",23));
        ts.add(new Person("abcd3",22));
        System.out.print(ts);
//        TreeSet ts = new TreeSet();
//        ts.add("abcd1");
//        ts.add("abcd2");
//        ts.add("abcd3");
//        ts.add("abcd2");
//        ts.add("abcd5");
//        ts.add("abcd4");
//        System.out.print(ts);
    }




}
