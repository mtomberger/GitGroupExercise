package at.fhj.iit;

public class Main implements Greeter{

	public static void main(String[] args) {
		Greeter g = new GreeterImpl("Markus Tomberger");
		Greeter g1 = new GreeterImpl("Lukas Wechtitsch");
		g.sayGoodbye();		
		g.sayHello();
		g1.sayGoodbye();
		g1.sayHello();
	}
}
