class Scalene extends Triangle{
	
	Scalene(){
	super();
		}
	
	Scalene(String name){
		super(name);
		}
	
	Scalene(double side1, double side2, double side3){
		super(side1, side2, side3);
		}
		
	Scalene(String name, double side1, double side2, double side3){
		super(name, side1, side2, side3);
		}
	
	boolean isScalene(){
		if((super.side1!=super.side2)||(super.side2!=super.side3)||(super.side3!=super.side1)){
			return true;
			}
		return false;
		}
	
	public String toString(){
		String display= "\nScalene";
		display += super.toString();
		display += "\n\t" + isScalene() + "\n";
		return display;
		}
	}
