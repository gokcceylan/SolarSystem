
class Yildiz extends GokCismi {
	public String tip;
	
	public Yildiz(int temperature, int diameter, String name, String tip) {
		super(temperature, diameter, name);
		this.tip = tip;
	}
	public Yildiz() {
		super();
	}
	
	public void sesVer() {
		System.out.println("This is " + this.name
				+ ". Temperature: " + this.temperature
				+ "C, Diameter: " + this.diameter + ", Type: " + this.tip);
	}
}
