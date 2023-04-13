package _6c.a__OOPs_UpCasting_UnderPolymorphism_Examples;

public class SuperClass__Mobile__Example1 {

	private String model;
	private String serialNo;
	
	public SuperClass__Mobile__Example1() {
		super();
		this.model = "";
		this.serialNo = "";
		
	}
	public SuperClass__Mobile__Example1(String model, String serialNo) {
		this();
		this.model = model;
		this.serialNo = serialNo;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	
	
	@Override
	public String toString() {
		return "\nModel:\t\t" + model + "\nSerial Number:\t" + serialNo;
	}
}
