abstract class Quadrilateral extends Polygon{
	public static final int FOUR_SIDES = 4;
	double side1;
	double side2;
	double side3;
	double side4;

	Quadrilateral(){
		this(1.0, 1.0, 1.0, 1.0);
	}

	Quadrilateral(String name){
		this(name, 1.0, 1.0, 1.0, 1.0);
	}

	Quadrilateral(double side1, double side2, double side3, double side4){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.side4=side4;
	}

	Quadrilateral(String name, double side1, double side2, double side3, double side4){
		super(name, FOUR_SIDES);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.side4=side4;
	}
	
	void findPerimeter(){
		super.perimeter = side1+side2+side3+side4;
	}

	abstract void findArea();

	public String toString(){
		String display = super.toString();
		display += "\nArea: " + area;
		display += "\n\tside1: " + side1 + "\n\tside2: " + side2 + "\n\tside3: " + side3 + "\n\tside4: " + side4;
		return display;
	}
}
