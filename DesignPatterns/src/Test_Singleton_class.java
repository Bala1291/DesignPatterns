class Test_Singleton_class{
	private static Test_Singleton_class t = new Test_Singleton_class();
	
	private  Test_Singleton_class() {
		}

public static Test_Singleton_class getTest(){
	return t;
}

}
//approach2
class Test1{
private static Test1 t =null;

private Test1(){
	
}

public static Test1 getTest()
{
	if (t == null){
		t =new Test1();
	}
  return t;
}




}

