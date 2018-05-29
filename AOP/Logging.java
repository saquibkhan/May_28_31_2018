import java.util.Date;

public aspect Logging{
	private pointcut time() : call(* Employee.*(..));
	
	before() : time(){
		System.out.println("***before calling " + thisJoinPoint + " at " + new Date());
	}	
	after() : time(){
		System.out.println("***after calling " + thisJoinPoint + " at " + new Date());
	}	
}