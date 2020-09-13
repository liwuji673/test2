package cn.itcase.Dome01;

public class TestCar {
	public static void main(String[] args) throws ClassNotFoundException {
		Car c= new Car();
		Class<?> forName = Class.forName("cn.itcase.Dome01.Car");
		System.out.println(forName);
		Class<? extends Car> class1 = c.getClass();
		
//		c.color = "ŸoÉ«";
//	    c.Number=4;
//	    c.Run();
//	    return;
	    
	    
	    
	    
	    
	    
	    
	}

}
