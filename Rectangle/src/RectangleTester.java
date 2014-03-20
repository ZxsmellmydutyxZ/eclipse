//Name - Elam Barnett
//Date - 2/10/14
//Lab  - Rectangle

public class RectangleTester {
	
public static void main(String[] args){
	Rectangle shape1 = new Rectangle(10, 10);
	Rectangle shape2 = new Rectangle(10, 10);
	
	
	System.out.println("Area of first Rectangle: " + shape1.getArea());
	System.out.println("Area of second Rectangle: " + shape2.getArea() + "\n");
	
	System.out.println("Perimeter of first Rectangle: " + shape1.getPerimeter());
	System.out.println("Perimeter of second Rectangle: " + shape2.getPerimeter() + "\n");
	
	
	Rectangle.displayAreaFormula();
	}
}
