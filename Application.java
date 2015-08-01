import java.util.*
class Application{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int x=9;
	while(x!=0){
	System.out.println("============================================");
	System.out.println("============================================");	
	System.out.println("a. Circle\nb. Triangle\nc. Quadrilateral\nd. Exit");
	System.out.println("============================================");
	System.out.println("============================================");
	String input=ConIn.readLine();
	
	if(input.equals("a")){
		System.out.println("============================================");
		System.out.println("a. Enter\tb. Exit\n");
		String cir=ConIn.readLine();
		if(cir.equals("a")){
			System.out.println("Enter name: ");
				String name = ConsoleInput.readLine();
			System.out.println("Enter radius: ");
				int radius = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("============================================");

			Circle c = new Circle(name, radius);
				c.findPerimeter();
				c.findArea();
				System.out.println(c.toString());
			}
		else{
			x=0;
			}
		}
		
	else if(input.equals("b")){
		System.out.println("============================================");
		System.out.println("a. Isosceles\tb. Equilateral\nc. Scalene\td. Exit\n");	
		String tri=ConIn.readLine();
			if(tri.equals("a")){
			System.out.println("Enter name: ");
					String name = ConsoleInput.readLine();
			System.out.println("Enter side1: ");
					int side1 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side2: ");
					int side2 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side3: ");
					int side3 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("============================================");

				Isosceles i = new Isosceles(name, side1, side2, side3);
					i.findPerimeter();
					i.findArea();
					System.out.println(i.toString());
			}
			else if(tri.equals("b")){
			System.out.println("Enter name: ");
					String name = ConsoleInput.readLine();
			System.out.println("Enter side1: ");
					int side1 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side2: ");
					int side2 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side3: ");
					int side3 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("============================================");

				Equilateral e = new Equilateral(name, side1, side2, side3);
					e.findPerimeter();
					e.findArea();
					System.out.println(e.toString());
			}
			else if(tri.equals("c")){
			System.out.println("Enter name: ");
					String name = ConsoleInput.readLine();
			System.out.println("Enter side1: ");
					int side1 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side2: ");
					int side2 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side3: ");
					int side3 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("============================================");
	
				Scalene sc = new Scalene(name, side1, side2, side3);
					sc.findPerimeter();
					sc.findArea();
					System.out.println(sc.toString());
			}
			else{
				x=0;
			}
		}
	
	else if(input.equals("c")){
		System.out.println("============================================");
		System.out.println("a. Parallelogram\tb. Rectangle\nc. Square\t\td. Trapezoid\ne. Exit\n");	
		String qua=ConIn.readLine();
		if(qua.equals("a")){
			System.out.println("Enter name: ");
					String name = ConsoleInput.readLine();
			System.out.println("Enter side1: ");
					int side1 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side2: ");
					int side2 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side3: ");
					int side3 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side4: ");
					int side4 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("============================================");
	
			Parallelogram p = new Parallelogram(name, side1, side2, side3, side4);
				p.findPerimeter();
				p.findArea();	
				System.out.println(p.toString());		
		}
		
		else if(qua.equals("b")){
			System.out.println("Enter name: ");
					String name = ConsoleInput.readLine();
			System.out.println("Enter side1: ");
					int side1 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side2: ");
					int side2 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side3: ");
					int side3 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side4: ");
					int side4 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("============================================");
	
			Rectangle r = new Rectangle(name, side1, side2, side3, side4);
				r.findPerimeter();
				r.findArea();	
				System.out.println(r.toString());		
		}
		
		else if(qua.equals("c")){
			System.out.println("Enter name: ");
					String name = ConsoleInput.readLine();
			System.out.println("Enter side1: ");
					int side1 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side2: ");
					int side2 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side3: ");
					int side3 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side4: ");
					int side4 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("============================================");
	
			Square sq = new Square(name, side1, side2, side3, side4);
				sq.findPerimeter();
				sq.findArea();	
				System.out.println(sq.toString());		
		}
		
		else if(qua.equals("d")){
			System.out.println("Enter name: ");
					String name = ConsoleInput.readLine();
			System.out.println("Enter side1: ");
					int side1 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side2: ");
					int side2 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side3: ");
					int side3 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("Enter side4: ");
					int side4 = Integer.parseInt(ConsoleInput.readLine());
			System.out.println("============================================");
	
			Trapezoid t = new Trapezoid(name, side1, side2, side3, side4);
				t.findPerimeter();
				t.findArea();	
				System.out.println(t.toString());	
			}
		else{
			x=0;
			}
		}
	else{
		x=0;
		}
		}
	}
}
