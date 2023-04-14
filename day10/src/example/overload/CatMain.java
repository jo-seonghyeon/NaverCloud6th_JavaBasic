package example.overload;

public class CatMain {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		System.out.println(c1.name);
		System.out.println(c1.kind);
		c1.call();
		c1.call("츄르");
		System.out.println("---------------------------");
		Cat c2 = new Cat("만두", "페르시안");
		System.out.println(c2.name);
		System.out.println(c2.kind);
		c2.call();
		c2.call("만두");
	}

}
