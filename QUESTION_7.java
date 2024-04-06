abstract class Account{
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public Account(String acno, double bal) {
		super();
		this.acno = acno;
		this.bal = bal;
	}
	private String acno;
	private double bal;
	public abstract void deposit(double amt);
	public abstract void withdrawal(double amt);
	public String toString() {
		return "ACC. NO.:-"+acno+" BALANCE:- "+bal;
	}
}
class SavingsAccount extends Account{
	public double getIr() {
		return ir;
	}

	public void setIr(double ir) {
		this.ir = ir;
	}

	private double ir;
	public SavingsAccount(String acno, double bal,double ir) {
		super(acno, bal);
		this.ir=ir;
	}

	@Override
	public void deposit(double amt) {
		setBal(getBal()+amt+(amt*ir/100));
	}

	@Override
	public void withdrawal(double amt) {
		if(getBal()>=amt) {
			setBal(getBal()-amt);
		}
		else {
			System.out.println("INSUFFICIENT BALANCE!!!!!");
		}
	}
}
class CurrentAccount extends Account{
	public double getOdl() {
		return odl;
	}

	public void setOdl(double odl) {
		this.odl = odl;
	}

	public CurrentAccount(String acno, double bal,double odl) {
		super(acno, bal);
		this.odl=odl;
	}

	private double odl;

	@Override
	public void deposit(double amt) {
		setBal(getBal()+amt);
	}

	@Override
	public void withdrawal(double amt) {
		if(getBal()-amt>=-odl) {
			setBal(getBal()-amt);
		}
		else {
			System.out.println("EXCEEDS OVERDRAFT LIMIT!!!!!");
		}
	}
	
}
public class QUESTION_7 {

	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount("SA1",10000,8.0);
		CurrentAccount ca=new CurrentAccount("CA001",20000,1000);
		sa.deposit(8450);
		sa.withdrawal(784);
		ca.deposit(7845);
		ca.withdrawal(7894);
		System.out.println("SAVINGS ACCOUNT");
		System.out.println(sa);
		System.out.println("CURRENT ACCOUNT");
		System.out.println(ca);
	}

}