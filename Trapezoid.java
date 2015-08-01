class Trapezoid extends Quadrilateral{

	Trapezoid(){
		super();
	}

	Trapezoid(String name){
		super(name);
	}

	Trapezoid(double side1, double side2, double side3, double side4){
		super(side1, side2, side3, side4);
	}

	Trapezoid(String name, double side1, double side2, double side3, double side4){
		super(name, side1, side2, side3, side4);
	}

	void findArea(){
		area=side1*(((side2+side4)/2)*Math.sin(Math.PI/4));
		}
	
	boolean isTrapezoid(){
		if((super.side1 != super.side2) && (super.side1 != super.side3) && (super.side1 != super.side4) && (super.side2 != super.side3) && (super.side2 != super.side4) && (super.side3 != super.side1) && (super.side3 != super.side4)){
			return true;
			}
	return false;
	}

	public String toString(){
		String display = "\nTrapezoid";
		display += super.toString();
		display += "\n\t" + isTrapezoid() + "\n";
		return display;
	}
}
