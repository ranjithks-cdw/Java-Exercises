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

/*
	An object for the class C is created. As the class C is inheriting the class A, constructor of A is called 1st while creating C object. 
	Then, its member variables definitions and declarations are assigned to the memory.
	An object is created for B and its reference is a member variable of C, so constructor of B is called.

	Finally, constructor of C(default) is called.
	Constructors are used to initalize member variable at the time of object creation, so member variables are created first, then the constructor.
*/