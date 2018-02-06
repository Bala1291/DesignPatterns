
public class SingletonDesignPattern {
	
	
	private static SingletonDesignPattern sobj=new SingletonDesignPattern();
	
	private SingletonDesignPattern(){
		
	}
	
	
	public static SingletonDesignPattern getSingletonDesignPattern(){
		return sobj;
	}
	
	public void dosomething(){
	System.out.println("hello");
	}

}


