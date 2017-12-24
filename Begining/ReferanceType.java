package Begining;

public class ReferanceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.name = "lobo";
		d.bread = "labridor";
		
		Dog d2;
		d2=d;
		System.out.println(d.name);
		System.out.println(d.bread);
		System.out.println(d2.name);
		System.out.println(d2.bread);
		

	}

}

class Dog {
	String name;
	String bread;
	
}
