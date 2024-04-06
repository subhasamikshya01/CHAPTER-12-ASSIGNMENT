class Point{
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point(Point oldp) {
		this.x=oldp.getX();
		this.y=oldp.getY();
	}

	private double x,y;
	
}
public class QUESTION_3 {

	public static void main(String[] args) {
		Point oldp=new Point(10,10.5);
		Point newp=new Point(oldp);
	}

}
