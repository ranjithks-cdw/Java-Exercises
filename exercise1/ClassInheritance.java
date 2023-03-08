package exercise1;

/**
 * 
 * Classes and its inheritance
 */
public class ClassInheritance {

	public static void main(String[] args) {
		C cObject = new C();
	}

}

class A {
	public A() {
		System.out.println("A Constructor");
	}
}

class B {
	public B() {
		System.out.println("B Constructor");
	}
}

class C extends A {
	public B bObj = new B();
}