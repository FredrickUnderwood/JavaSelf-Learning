public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person("John");
        p1.setAge(21);
        int p1_age;
        p1_age = p1.getAge();
        //静态变量不需要通过实例访问，可以通过类名访问
        System.out.println(Person.personSex);
        System.out.println(Person.personType);
    }
}
