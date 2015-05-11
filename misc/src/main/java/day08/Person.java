package day08;

import java.util.Comparator;

/**
 * Created by Administrator on 2015/5/11.
 */
public class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age
                ;
    }

    @Override
    public int compareTo(Object o) {
        Person p=(Person) o;
        int temp=this.age-p.age;
        return temp==0?this.name.compareTo(p.name):temp;
    }
}
