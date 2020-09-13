package cn.itcase.Dome05;



public class TestPerson {
	public static void main(String[] args) {
		//创建persion类实例
		Person persion1 = new Person();
		
//		调用方法设置对象的年龄的姓名；
		persion1.setAge(10);
		persion1.setName("旺财");
//		调用方法获取对象的姓名和年龄
		persion1.getAge();
		persion1.getName();
//		调用方法看到对象的姓名和年龄
		persion1.Speak();
		System.out.println(persion1.getAge());
		
	}
}
