class Car{
	private int make;
	private String model;
	public Car(int i, String model){
		this.make=0;
		this.model=null;
	}
	public Car(){
		this.make=0;
		this.model=null;
	}
	public int getmake() {
		return this.make;
	}
	public String getmodel() { 
		return this.model;
	}
	public void setmake(int make) {
		this.make=make;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public String toString() {
		return "make= "+make+" model= "+model;
		
	}
}
public class CarTester {

	public static void main(String[] args) {
		Car myCar1=new Car(2010,"I10");
		Car myCar2=new Car();
		System.out.println("CAR 1:- ");
		System.out.println(myCar1);
		System.out.println();
		System.out.println("CAR 2:- ");
		System.out.println(myCar2);
		System.out.println();
		myCar2.setmake(2023);
		myCar2.setmodel("CRETA SX");
		System.out.println("CAR 2 MODEL AND MAKE UPDATED!!!!!");
		System.out.println();
		System.out.println("CAR 2:- ");
		System.out.println(myCar2);
	}

}
