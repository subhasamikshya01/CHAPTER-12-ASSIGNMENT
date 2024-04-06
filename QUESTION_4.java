class Laptop{
	private String model;
	private double price;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "MODEL= "+model+"\nPRICE= "+price;
	}
	
}
public class QUESTION_4 {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setModel("HP PAVILION");
		l.setPrice(71999.00);
		System.out.println(l);
	}

}
//toString() returns string representation of the object. By overriding toString() of the object class, we can return value of the object.  
