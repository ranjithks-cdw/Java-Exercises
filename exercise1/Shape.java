package exercise1;

/**
 * 
 * Program to calculate properties of shape
 */
public class Shape {

	public static void main(String[] args) {
		System.out.println("Circle");
		new Circle(5.5).displayProperties();
		System.out.println("Square");
		new Square(4.55).displayProperties();
		System.out.println("Triangle");
		new Triangle(3,5,7).displayProperties();
		System.out.println("Sphere");
		new Sphere(44).displayProperties();
		System.out.println("Cuboid");
		new Cuboid(32).displayProperties();
	}

}

interface CalcPerimeter {
	public void calculatePerimeter();
}

interface CalcArea {
	public void calculateArea();
}

interface CalcVolume {
	public void calculateVolume();
}

interface CalcSurfaceArea {
	public void calculateSurfaceArea();
}

class Circle implements CalcPerimeter,CalcArea {
	protected double radius;
	private double perimeter;
	private double area;
	
	public Circle(double radius) {
		this.radius = radius;
		this.calculatePerimeter();
		this.calculateArea();
	}
	
	@Override
	public void calculatePerimeter() {
		this.perimeter = 2*Math.PI*this.radius;
		
	}
	
	@Override
		public void calculateArea() {
			this.area = this.radius*this.radius*Math.PI;
		}
	public void displayProperties() {
		System.out.println("Radius: "+ this.radius);
		System.out.println("Perimeter: "+ this.perimeter);
		System.out.println("Area: "+ this.area);
	}
}

class Square implements CalcPerimeter,CalcArea {
	protected double side;
	private double perimeter;
	private double area;
	
	public Square(double radius) {
		this.side = radius;
		this.calculatePerimeter();
		this.calculateArea();
	}
	
	@Override
	public void calculatePerimeter() {
		this.perimeter = 4*this.side;
	}
	
	@Override
		public void calculateArea() {
			this.area = this.side*this.side;
		}
	public void displayProperties() {
		System.out.println("Radius: "+ this.side);
		System.out.println("Perimeter: "+ this.perimeter);
		System.out.println("Area: "+ this.area);
	}
}

class Triangle implements CalcPerimeter,CalcArea {
	protected double side1,side2,side3;
	private double perimeter;
	private double area;
	
	public Triangle(double side1,double side2,double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.calculatePerimeter();
		this.calculateArea();
	}
	
	@Override
	public void calculatePerimeter() {
		this.perimeter = this.side1+this.side2+this.side3;
	}
	
	@Override
		public void calculateArea() {
			double semiPerimeter = this.perimeter/2;
			double areaTemp = semiPerimeter*(semiPerimeter-this.side1)*(semiPerimeter-this.side2)*(semiPerimeter-this.side3);
			this.area = Math.sqrt(areaTemp);
			System.out.println(areaTemp);
		}
	public void displayProperties() {
		System.out.println("Sides: "+ this.side1+" "+this.side2+" "+this.side3);
		System.out.println("Perimeter: "+this.perimeter);
		System.out.println("Area: "+ this.area);
	}
}

class Sphere extends Circle implements CalcSurfaceArea,CalcVolume {
	private double surfaceArea;
	private double volume;
	
	public Sphere(double radius) {
		super(radius);
		this.calculateSurfaceArea();
		this.calculateVolume();
	}
	
	@Override
	public void calculateSurfaceArea() {
		this.surfaceArea = 4*this.radius*this.radius*Math.PI;
	}
	
	@Override
	public void calculateVolume() {
		this.volume = 4/3*Math.PI*this.radius*this.radius*this.radius;
	}
	
	@Override
	public void displayProperties() {
		super.displayProperties();
		System.out.println("Surface Area: "+this.surfaceArea);
		System.out.println("Volume: "+this.volume);
	}
}

class Cuboid extends Square implements CalcSurfaceArea,CalcVolume {
	private double surfaceArea;
	private double volume;
	
	public Cuboid(double side) {
		super(side);
		this.calculateSurfaceArea();
		this.calculateVolume();
	}
	
	@Override
	public void calculateSurfaceArea() {
		this.surfaceArea = 6*this.side*this.side;
	}
	
	@Override
	public void calculateVolume() {
		this.volume = this.side*this.side*this.side;
	}
	
	@Override
	public void displayProperties() {
		super.displayProperties();
		System.out.println("Surface Area: "+this.surfaceArea);
		System.out.println("Volume: "+this.volume);
	}
}