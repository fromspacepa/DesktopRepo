package _6c.a__OOPs_UpCasting_UnderPolymorphism_Examples;

public class SubClass__Apple__Example1 extends SuperClass__Mobile__Example1 {
	
	private String make;
	
	public SubClass__Apple__Example1() {
		super();
		this.make = "";
		
	}
	public SubClass__Apple__Example1(String make, String model, String serialNo) {
		super(model, serialNo);
		this.make = make;
		
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	@Override
	public String toString() {
		return "\nMake:\t\t" + make + "\nModel:\t\t" + super.getModel() + "\nSerial Number:\t" + super.getSerialNo();
	}
	
	
	

}
