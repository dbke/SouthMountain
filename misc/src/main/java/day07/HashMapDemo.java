package day07;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Administrator on 2015/5/11.
 */
public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Student,String> hs=new HashMap<Student,String>();
        hs.put(new Student("abcd1",20),"北京");
        hs.put(new Student("abcd2",21),"上海");
        hs.put(new Student("abcd2",21),"上海");
        hs.put(new Student("abcd3",22),"湖北");
        hs.put(new Student("abcd4",23),"成都");
        Iterator<Student> it = hs.keySet().iterator();
        while (it.hasNext()){
            Student st =it.next();
            String values = hs.get(st);
            System.out.println(st+":"+values);
        }

    }
}
