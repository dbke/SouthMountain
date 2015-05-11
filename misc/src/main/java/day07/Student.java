package day07;

/**
 * Created by Administrator on 2015/5/11.
 */
public class Student extends Person{
    public Student(String name,int age) {
        super(name,age);
    }
    public String toString(){
        return getName()+":"+getAge();
    }
}
