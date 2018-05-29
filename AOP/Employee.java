public class Employee{
	public void work(){
		System.out.println("Employee working");
	}
	public void browseFB(){
		System.out.println("On Facebook");
		try {
			Thread.sleep(2000);
		}catch(Exception ex){}	
	}
}