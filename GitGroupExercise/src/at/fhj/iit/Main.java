package at.fhj.iit;

public class Main implements Greeter{

	public static void main(String[] args) {
		
		Greeter g = new GreeterImpl("Lukas Wechtitsch");
		Greeter g1 = new GreeterImpl("Markus Tomberger");
		g.sayGoodbye();
		g.sayGoodbye();
		
		g1.sayGoodbye();
		g1.sayGoodbye();
	}
}
