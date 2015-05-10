package day05;



import java.util.Comparator;

/**
 * Created by Administrator on 2015/5/10.
 */
public class CompareByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1=(Person)o1;
        Person p2=(Person)o2;
        int temp=p1.getName().compareTo(p2.getName());
        return temp==0?p1.getAge()-p2.getAge():temp;
    }
}
