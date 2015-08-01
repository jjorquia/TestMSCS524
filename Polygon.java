abstract class Polygon extends Shape{
	int no_of_sides;
	double perimeter;
	
	Polygon(){}
	Polygon(String name){
		super(name);
		}
	Polygon(String name, int no_of_sides){
		super(name);
		this.no_of_sides=no_of_sides;
	}
	
	abstract void findPerimeter();
	
	public String toString(){
		String display = super.toString();
		display += "\nPerimeter: " + perimeter;
		display += "\nNumber of Sides: " + no_of_sides;
		return display;
		}
	
	}
