package QUESTION_8;
interface Vehicle{
	void accelerate();
	void brake();
}
class Owner{
	public Owner(String name, int yob) {
		super();
		this.name = name;
		this.yob = yob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public Vehicle getC() {
		return c;
	}
	public void setC(Vehicle c) {
		this.c = c;
	}
	public Vehicle getB() {
		return b;
	}
	public void setB(Vehicle b) {
		this.b = b;
	}
	private String name;
	private int yob;
	Vehicle c,b;
}
class Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("CAR IS ACCELERATING!");
	}
	@Override
	public void brake() {
		System.out.println("CAR IS DECELERATING!");
	}
	public void accelerate(double s) {
		System.out.println("CAR IS ACCELERATING AT A RATE OF "+s+" km/hr");
	}
	public void accelerate(double s,int d) {
		System.out.println("CAR IS ACCELERATING AT A RATE OF "+s+" km/hr for "+d+" MINS");
	}
	
}
class Bicycle implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("BICYCLE IS ACCELERATING!");
	}
	@Override
	public void brake() {
		System.out.println("BICYCLE IS DECELERATING!");
	}
	public void accelerate(double s) {
		System.out.println("BICYCLE IS ACCELERATING AT A RATE OF "+s+" km/hr");
	}
	public void accelerate(double s,int d) {
		System.out.println("BICYCLE IS ACCELERATING AT A RATE OF "+s+" km/hr for "+d+" MINS");
	}
	
}
public class QUESTION_8 {

	public static void main(String[] args) {
		Vehicle c=new Car();
		Vehicle b=new Bicycle();
		Owner o=new Owner("ABC",1997);
		Owner o2=new Owner("DEF",1999);
		o.setB(b);
		o2.setC(c);
		System.out.println();
		c.accelerate();
		c.brake();
		b.accelerate();
		b.brake();
		System.out.println();
		((Car)c).accelerate(80);
		((Car)c).accelerate(80,20);
		System.out.println();
		((Bicycle)b).accelerate(15);
		((Bicycle)b).accelerate(15,25);
		
	}

}
