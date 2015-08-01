class Parallelogram extends Quadrilateral{

	Parallelogram(){
		super();
	}

	Parallelogram(String name){
		super(name);
	}

	Parallelogram(double side1, double side2, double side3, double side4){
		super(side1, side2, side3, side4);
	}

	Parallelogram(String name, double side1, double side2, double side3, double side4){
		super(name, side1, side2, side3, side4);
	}

	void findArea(){
		area=side1*(side2*Math.sin(Math.PI/4));
		}

	
	boolean isParallelogram(){
		if(super.side1 == super.side3 && super.side2 == super.side4){
			return true;
			}
		return false;
	}

	public String toString(){
		String display = "\nParallelogram";
		display += super.toString();
		display += "\n\t" + isParallelogram() + "\n";
		return display;
	}
}
