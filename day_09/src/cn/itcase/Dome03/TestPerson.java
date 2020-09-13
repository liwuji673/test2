package cn.itcase.Dome03;
//基本数据类型和引用数据类型

public class TestPerson {
	public static void main(String[] args) {
		int a=1;
		Person LL=new Person();
		cesi(a);
		System.out.println(a);
		LL.name= "张三";
		ceis(LL);
		System.out.println(LL.name);
	}
	
	
//	基本数据类型做参不会改变原本数值
	public static void cesi(int L){
		L=L+3;
	}
	
	/*引用数据类型：某个类，数组，集合等为引用数据类型
	做参时会改变原本数值，其参传递的是一个地址
	在使用这个方法时，通过这个地址找到引用数据类型的位置对其进行 修改。方法结束后出栈
	但是引用数据类型的成员的数值已经被修改*/
	public static void ceis(Person iii){
		iii.name="李四";
	}

}
