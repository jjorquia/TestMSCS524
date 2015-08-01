abstract class Shape{
	String name;
	double area;
	
	Shape(){}
	Shape(String name){
		this.name=name;
		}
	
	abstract void findArea();
	
	public String toString(){
		String display = "\nName: " + name;
		return display;
		}	
	}
