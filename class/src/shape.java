


public class shape {

	public double width;
	public double height;
	public shape(double w, double h) {
		this.width = w;
		
		this.height = h;
		
		
		
		
		
	}
	public double area(){
		return(this.width * this.height);
				}
	
	
	public static void main(String[] args) {
		
		
		shape a = new shape(2,3);
		shape b = new shape(6,9);
		shape r = new rectangle(8,4);
		shape s = new square(3);
		shape t = new tri(4,6);
		shape t2 = new tri(7,4);
		shape c = new circ(7);
		
		System.out.println("Area of a: " + a.area());
		System.out.println("Area of b: " + b.area());
		System.out.println("Area of r: " + r.area());
		System.out.println("Area of s: " + s.area());
		System.out.println("Area of t: " + t.area());
		System.out.println("Area of t2: " + t2.area());
		System.out.println("Area of c: " + c.area());
	}
}

class rectangle extends shape {

	public rectangle(int w, int h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

class square extends shape {

	public square(int w) {
		super(w, w);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

class tri extends shape{

	public tri(int b, int h) {
		super(b, h);
		// TODO Auto-generated constructor stub
		
		
		
		
	}

	public double area(){
		return(this.width * this.height / 2);
			
	
	}	
	
	
	
	
	
	
}



class circ extends shape{

	public circ(int r) {
		super(r, r);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	



public double area(){
	return(this.width * this.width * Math.PI);
}

}

