package oopsConcept;

class Shape {

	  int length;
	  int breadth;
	  // constructor to initialize values
	  Shape(int length, int breadth) { 
	    this.length = length;
	    this.breadth = breadth;
	  }
 
	  public void getArea() {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }
	  
	  public void getParameter() {
		  int para = 2*(length + breadth);
		  System.out.println("Parameter: " + para);
	  }
	}

	public class Encapsulation {
	  public static void main(String[] args) {

	    Shape rect = new Shape(5, 5); 
	    rect.getArea();
	    rect.getParameter();
	  }
	}
