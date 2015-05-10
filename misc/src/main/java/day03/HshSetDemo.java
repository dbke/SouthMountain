package day03;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by Administrator on 2015/5/10.
 */
public class HshSetDemo {
     public static void  main(String[] args){
//         HashSet hs = new HashSet();

         //按添加顺序输出LinkedHashSet
         HashSet hs = new LinkedHashSet();
         hs.add("abcd1");
         hs.add("abcd2");
         hs.add("abcd3");
         hs.add("abcd4");
         System.out.print(hs);


     }
}
