class Equilateral extends Triangle{
	
	Equilateral(){
	super();
		}
	
	Equilateral(String name){
		super(name);
		}
	
	Equilateral(double side1, double side2, double side3){
		super(side1, side2, side3);
		}
		
	Equilateral(String name, double side1, double side2, double side3){
		super(name, side1, side2, side3);
		}
	
	boolean isEquilateral(){
		if((super.side1==super.side2)&&(super.side2==super.side3)&&(super.side3==super.side1)){
			return true;
			}
		return false;
		}
	
	public String toString(){
		String display= "\nEquilateral";
		display += super.toString();
		display += "\n\t" + isEquilateral() + "\n";
		return display;
		}
	}
