package cn.itcase.Dome07;

import java.util.ArrayList;
import java.util.Random;



/*随机点名器
 * 1.创建集合存储Studen类实例
 * 2.总览学生信息
 * 3.生成随机数，作为索引去集合中查找元素
 * */
public class CallName {
public static void main(String[] args) {
	
	
	
	
//	创建arraylist集合存储Student实例
	ArrayList<Student> array = new ArrayList<Student>();
	addStudent(array);
	printStudent(array);
	randomStudent(array);
}

//定义方法：总览学生信息，遍历集合
private static void printStudent(ArrayList<Student> array) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		for(int i = 0;i < array.size();i++){
			Student ss = array.get(i);
			
		System.out.println(ss.getName()+"..."+ss.getAge());
		}
}
//定义方法：创建Student对象并存入集合s
private static void addStudent(ArrayList<Student> array) {
	// TODO Auto-generated method stub
//	创建Stuent对象
	Student s1 =new Student();
	s1.setName("李四1");
	s1.setAge(15);
	
	Student s2 =new Student();
	s2.setName("李四2");
	s2.setAge(152);
	
	Student s3 =new Student();
	s3.setName("李四3");
	s3.setAge(153);
	
	Student s4 =new Student();
	s4.setName("李四4");
	s4.setAge(154);
	
	Student s5 =new Student();
	s5.setName("李四5");
	s5.setAge(155);
	array.add(s1);
	array.add(s2);
	array.add(s3);
	array.add(s4);
	array.add(s5);
}

//定义方法随机生成一个数并作为索引访问元素
private static void randomStudent(ArrayList<Student> array) {
	// TODO Auto-generated method stub
	Random r = new Random();
	int index= r.nextInt(array.size());
	Student s = array.get(index);
	System.out.println(s.getName());
}


}