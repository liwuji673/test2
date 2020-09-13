package cn.itcase.Dome04;

public class person {
	//人的名字
	String name;
	//人的年龄
	private int age;
	//创建方法设置人的年龄
	public void  setAge(int a){
		if(a<0||a>200){
			System.out.println("输出错误，请重新输入");
		}else{
			age=a;
		}
		
}
	//定义方法，方法中人说出自己的姓名和年龄
	public void Speak(){
	
		System.out.println("我的名字是"+name+        "      我已经"+age+"岁了");
	}
//	定义方法，对变量age取值
	public int getAge(){
		return age;
	}

}
