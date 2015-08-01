class Circle extends Shape{

	double radius, perimeter, area;

	Circle(){
		this(1.0);
	}

	Circle(String name){
		super(name);
	}

	Circle(double radius){
		this.radius = radius;
	}

	Circle(String name, double radius){
		super(name);
		this.radius=radius;
	}

	void findPerimeter(){
		perimeter = (2*(Math.PI)*(radius));
	}

	void findArea(){
		area = (Math.PI)*(Math.pow(radius,2));
	}
	
	public String toString(){
		String display = "\nCircle";
		display += super.toString();
		display += "\n\tRadius: " + radius;
		display += "\n\tCircumference: " + perimeter;
		display += "\n\tArea: " + area + "\n";
		return display;
	}

}
