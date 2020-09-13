package cn.itcase.Dome06;

public class TestPerson {
public static void main(String[] args) {
	
	Person p1 = new Person();
    Person p2 = new Person();
    p1.setAge(15);
    p2.setAge(16);
//    p1调用方法compare来传递p2对象
     boolean b= p1.compare(p2);
     System.out.println(b);

}	
}
