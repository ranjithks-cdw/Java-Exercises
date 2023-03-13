package exercise1;

/**
 * 
 * Program to demonstrate pass by value and reference
 */
public class Pass {

	public static void main(String[] args) {
		Primitive primObj = new Primitive();
		System.out.println("Original Values: ");
		primObj.displayValues();
		
		changeValues(primObj.byteVal,primObj.shortVal,primObj.intVal,primObj.longVal,primObj.floatVal,primObj.doubleVal,primObj.booleanVal,primObj.charVal,primObj.arr);
		
		System.out.println("Values after passing as values: ");
		primObj.displayValues();
		
		changeValues(primObj);
		System.out.println("Values after passing as reference: ");
		primObj.displayValues();
	}
	private static void changeValues(byte byteVal,short shortVal,int intVal,long longVal,float floatVal,double doubleVal,boolean booleanVal,char charVal,int[] arr) {
		byteVal = 11;
		shortVal = 22;
		intVal = 333;
		longVal = 22222L;
		floatVal = 1.0F;
		doubleVal = 88.78D;
		booleanVal = false;
		charVal = 'R';
		arr[0] = 3;
	}
	private static void changeValues(Primitive pr) {
		pr.byteVal = 11;
		pr.shortVal = 22;
		pr.intVal = 333;
		pr.longVal = 22222L;
		pr.floatVal = 1.0F;
		pr.doubleVal = 88.78D;
		pr.booleanVal = false;
		pr.charVal = 'R';
		pr.arr[0] = 6;
	}

}

class Primitive {
	public byte byteVal;
	public short shortVal;
	public int intVal;
	public long longVal;
	public float floatVal;
	public double doubleVal;
	public boolean booleanVal;
	public char charVal;
	public int[] arr;
	
	public Primitive() {
		this.byteVal = 5;
		this.shortVal = 7;
		this.intVal = 29;
		this.longVal = 55L;
		this.floatVal = 33.4F;
		this.doubleVal = 44.323D;
		this.booleanVal = true;
		this.charVal = 'A';
		this.arr = new int[] {5};
	}
	public void displayValues() {
		System.out.println("Byte: "+this.byteVal);
		System.out.println("Short: "+this.shortVal);
		System.out.println("Integer: "+this.intVal);
		System.out.println("Long: "+this.longVal);
		System.out.println("Float: "+this.floatVal);
		System.out.println("Double: "+this.doubleVal);
		System.out.println("Boolean: "+this.booleanVal);
		System.out.println("Char: "+this.charVal);
		System.out.println("Array: "+this.arr[0]);
	}
}