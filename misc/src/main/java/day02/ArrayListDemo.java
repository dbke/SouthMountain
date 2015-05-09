package day02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2015/5/9.
 * 去重功能
 */
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        demo(al);
        al=getsingle(al);
        System.out.println(al);
}
    public static  void demo(ArrayList al ){
       // ArrayList al = new ArrayList();
        al.add(new Person("abcd1",20));
        al.add(new Person("abcd2",21));
        al.add(new Person("abcd1",20));
        al.add(new Person("abcd3",20));
        System.out.println(al);

    }
    public static ArrayList getsingle(ArrayList al) {
        ArrayList temp = new ArrayList();
        Iterator it = al.iterator();
        while(it.hasNext()){
            Person p= (Person)it.next();
            if(!temp.contains(p)){ //这里会调用equals方法 ，一定要覆盖equals

                temp.add(p);
            }
        }
        return temp;
    }

}
