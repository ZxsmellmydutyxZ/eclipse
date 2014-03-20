//Name - Elam Barnett
//Date - 2/10/14
//Lab  - Rectangle

public class Rectangle {
	public double length;
	public double width;
	

public Rectangle() {
	length = 1;
	width = 1;
	}

public Rectangle(double l, double w){
	length = l;
	width = w;
	}

public double getArea(){
	double a;
	a = length * width;
	return(a);
	}

public double getPerimeter(){
	double p;
	p = length * 2 + width * 2;
	return(p);
	}

public static void displayAreaFormula(){
	System.out.println("Formula for Area: Length * Width");
	}
public String toString(){
	String b;
	b = "The Rectangles are ";
	return(b);
	}
}










