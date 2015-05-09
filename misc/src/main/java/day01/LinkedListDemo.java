package day01;

import java.util.LinkedList;

/**
 * Created by Administrator on 2015/5/9.
 */
public class LinkedListDemo {
 public static void main(String[] args){
     LinkedList link = new LinkedList();
     link.addFirst("abcd1");
     link.addFirst("abcd2");
     link.addFirst("abcd3");
     link.addFirst("abcd4");

     System.out.println(link);

     while(!link.isEmpty()){
         System.out.println(link.removeLast());

     }
     System.out.print(link);




 }

}
