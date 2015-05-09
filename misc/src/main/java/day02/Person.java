package day02;

/**
 * Created by Administrator on 2015/5/9.
 */
public class Person {
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

    public boolean equals(Object obj){//覆盖方法时注意返回值类型和参数列表（Object类）
        if(this==obj){
            return  true;
        }
        if(!(obj instanceof Person))
            throw new ClassCastException("类型错误");
        Person p=(Person) obj;
        return (this.name.equalsIgnoreCase(p.name) && this.age==p.age);
    }
    public String toString(){   //注意返回值类型为String 参数为空
         return ( name+":" +age );
    }

}
