package cn.itcase.Dome04;
/*进行persion类的测试
 * 创建peisonde的实例
 * 对属性进行赋值
 * */
public class TestPersion {
	public static void main(String[] args) {
		//创建persion类实例
		person persion1 = new person();
		//对对象内成员变量赋值
		persion1.name = "破军";
//		调用方法对persion私有成员赋值；
		persion1.setAge(-10);
//		调用方法看到对象的姓名和年龄
		persion1.Speak();
		System.out.println(persion1.getAge());
		
	}

}
