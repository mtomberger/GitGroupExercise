package at.fhj.iit;

public class GreeterImpl implements Greeter {
	
	private String name;
	
	public GreeterImpl(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		
	}
	
	public void sayGoodbye() {
		System.out.println("Good Bye, " + name);
	}
}