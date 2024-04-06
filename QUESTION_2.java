class Rectangle{
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	
	public void calculate_area(){
		System.out.println("AREA= "+((this.length)*(this.width)));
	}
	
	
	public void calculate_perimeter(){
		System.out.println("PERIMETER= "+(2*((this.length)+(this.width))));
	}
	

	private double length,width;
}
public class QUESTION_2 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,8);
		r.calculate_area();
		r.calculate_perimeter();
	}

}
