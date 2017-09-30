package pam.cm.hello;
public class HelloWorld implements IHelloWorld {
	String message;
	public HelloWorld() {
		this("Bonjour le Monde");
	}
	public HelloWorld(String message) {
		super();
		this.message = message;
	}
	public String sayHello() {
		return message;
	}
}
