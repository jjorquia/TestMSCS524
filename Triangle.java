class Triangle extends Polygon{
	public static final int TRI_SIDES=3;
	double side1;
	double side2;
	double side3;
	
	Triangle(){
		this(1.0,1.0,1.0);
		}
		
	Triangle(String name){
		this(name,1.0,1.0,1.0);
		}
	
	Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		}
	
	Triangle(String name, double side1, double side2, double side3){
		super(name, TRI_SIDES);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		}
	
	void findPerimeter(){
		super.perimeter=side1 + side2 + side3;
		}
	
	void findArea(){
		double s = (side1+side2+side3)/2;
		super.area = Math.sqrt((s*side1)*(s*side2)*(s*side3));
		}
		
	public String toString(){
		String display= super.toString();
		display += "\nArea: " + area;
		display += "\n\tside1 :" + side1+ "\n\tside2 :" + side2+ "\n\tside3 :" + side3;
		return display;
		}
	}
