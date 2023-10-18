/*
1. 一个Java源文件只能有一个public类
2. 源文件名和public类的类名保持一致
3. package语句、import、类声明 按这个顺序写
*/
public class Person {
    String personName;
    int personAge;
    //静态变量不初始化则返回null，成员变量未初始化访问则报错
    static String personSex;
    static String personType = "Stu";
    //构造方法1
    public Person() {

    }

    //构造方法2
    public Person(String name) {
        this.personName = name;
        System.out.println("My name is " + name);
    }

    public void setAge(int age){
        personAge = age;
    }

    public int getAge(){
        System.out.println("My age is " + personAge);
        return personAge;
    }
}
