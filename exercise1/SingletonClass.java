package exercise1;

/**
 * 
 * Class with only one instance
 */
public class SingletonClass {

	public static void main(String[] args) {
		Singleton singletonObj = Singleton.getInstance();
		System.out.println(singletonObj);
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
	}

}

class Singleton {
	private static Singleton singletonObj=null;
	
	//	Constructor
	private Singleton() {
		System.out.println("Singleton constructor after new initialization");
	}
	public static Singleton getInstance() {
		if(singletonObj==null)
			singletonObj = new Singleton();
		return singletonObj;
	}
}