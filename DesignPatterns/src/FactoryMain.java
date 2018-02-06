import com.phone.FactoryDesignPatternClass;
import com.phone.OS;
import com.phone.Windows;


public class FactoryMain {
	
	
	public static void main(String args[]){
		
		
		FactoryDesignPatternClass utl=new FactoryDesignPatternClass();
		OS obj=utl.getInstance("safjh");
		obj.spec();
		
		
	}

}
