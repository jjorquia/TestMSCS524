class Isosceles extends Triangle{
	
	Isosceles(){
	super();
		}
	
	Isosceles(String name){
		super(name);
		}
	
	Isosceles(double side1, double side2, double side3){
		super(side1, side2, side3);
		}
		
	Isosceles(String name, double side1, double side2, double side3){
		super(name, side1, side2, side3);
		}
	
	boolean isIsosceles(){
		if((super.side1==super.side2)||(super.side2==super.side3)||(super.side3==super.side1)){
			return true;
			}
		return false;
		}
	
	public String toString(){
		String display= "\nIsosceles";
		display += super.toString();
		display += "\n\t" + isIsosceles() + "\n";
		return display;
		}
	}
