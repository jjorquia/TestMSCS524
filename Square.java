class Square extends Quadrilateral{

	Square(){
		super();
	}

	Square(String name){
		super(name);
	}

	Square(double side1, double side2, double side3, double side4){
		super(side1, side2, side3, side4);
	}

	Square(String name, double side1, double side2, double side3, double side4){
		super(name, side1, side2, side3, side4);
	}

	void findArea(){
		area=Math.pow(side1,2);
		}
	
	boolean isSquare(){
		if((super.side1 == super.side2) && (super.side1 == super.side3) && (super.side1 == super.side4) && (super.side2 == super.side3) && (super.side2 == super.side4) && (super.side3 == super.side1) && (super.side3 == super.side4)){
			return true;
			}
	return false;
	}

	public String toString(){
		String display = "\nSquare";
		display += super.toString();
		display += "\n\t" + isSquare() + "\n";
		return display;
	}
}
