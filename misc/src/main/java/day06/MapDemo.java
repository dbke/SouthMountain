package day06;

import java.util.*;

/**
 * Created by Administrator on 2015/5/10.
 */
public class MapDemo {
    public static void main(String[] args){
        Map<Integer,String> ma =new HashMap<Integer, String>();
//        保证键的唯一性和set类似
//        HashMap与HashSet类似
//        TreeMap与TreeSet类似
        ma.put(1,"abc2");
        ma.put(1,"abc2");
        ma.put(2,"abc3");
        ma.put(2,"abc2");
        ma.put(3,"abc3");
        ma.put(4,"abc4");

//        获取所有的values
        Collection<String> values =ma.values();
        Iterator<String> it1=values.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

//        获取所有的map元素方式一：获取映射关系，再迭代器一一获取key 和value
        Set<Map.Entry<Integer,String>> entrySet =ma.entrySet();
        Iterator<Map.Entry<Integer,String>> it3 =entrySet.iterator();
        System.out.println("方式一：");
        while(it3.hasNext()){
            Map.Entry<Integer,String> en= it3.next();
            int key = en.getKey();
            String value=en.getValue();
            System.out.println(key+"="+value);
        }

//方式二：先获取所有的keys 再用迭代器一一获取value
        Set<Integer> keySet=ma.keySet();
        Iterator<Integer> it2 = keySet.iterator();
        System.out.println("方式二：");
        while(it2.hasNext()){
            int key1=it2.next();
            String  value1 =ma.get(key1);
            System.out.println(key1+"="+value1);
        }




    }
}
