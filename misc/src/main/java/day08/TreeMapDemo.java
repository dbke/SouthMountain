package day08;

import day07.*;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2015/5/11.
 */
public class TreeMapDemo {
    public static  void main(String[] args){
        TreeMap<Student,String> tm =new TreeMap<Student,String>();
        tm.put(new Student("abcd1",20),"北京");
        tm.put(new Student("abcd1",20),"上海");//一个key只对应一个value
        tm.put(new Student("abcd2",21),"上海");
        tm.put(new Student("abcd2",21),"上海");
        tm.put(new Student("abcd3",22),"湖北");
        tm.put(new Student("abcd4",23),"成都");

        Iterator<Map.Entry<Student,String>> it =tm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Student,String> ma=it.next();
            Student st=ma.getKey();
            String values = ma.getValue();
            System.out.println(st+":"+values);
        }
    }
}
