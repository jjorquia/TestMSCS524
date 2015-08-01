class Rectangle extends Quadrilateral{

	Rectangle(){
		super();
	}

	Rectangle(String name){
		super(name);
	}

	Rectangle(double side1, double side2, double side3, double side4){
		super(side1, side2, side3, side4);
	}

	Rectangle(String name, double side1, double side2, double side3, double side4){
		super(name, side1, side2, side3, side4);
	}

	void findArea(){
		area=side1*side2;
		}
	
	boolean isRectangle(){
		if(super.side1 == super.side3 && super.side2 == super.side4){
			return true;
			}
		return false;
	}

	public String toString(){
		String display = "\nRectangle";
		display += super.toString();
		display += "\n\t" + isRectangle() + "\n";
		return display;
	}
}
