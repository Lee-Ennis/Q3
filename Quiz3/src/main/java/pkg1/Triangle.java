package pkg1;

public class Triangle extends GeometricObject {
	
	private double side1;
	private double side2;
	private double side3;
	
	double s = (this.side1 + this.side2 + this.side3)/2 ;
	double area = Math.sqrt(s *(s - this.side1) * (s - this.side2) * (s - this.side3));
	// From piazza
	// Did these formulas up here so I could implement getArea function more clear.
	
	public Triangle(){ // default triangle
		side1 = 1;
		side2 = 1;
		side3 = 1;
		
	}
	
	public Triangle(double s1, double s2, double s3){
		super();
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}

		
			
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getArea(){
		// using "s" and "area" formulas
		return area;
	}
	
	public double getPerimeter(){
		return (this.side1 + this.side2 + this.side3);
	}
	
	@Override
	public String toString(){
		return 
				"Side lengths:" + getSide1() + "," + getSide2() + "and" +getSide3() +
				"Perimeter:" + getPerimeter() +
				"Area:" + getArea();
	}      // Assuming this is sufficient info from the piazza post.

	

}
