
class GokCismi {
	public String name;
	public int temperature;
	public int diameter;
	public GokCismi() {
		this.name = "isimsiz";
		this.temperature = -1;
		this.diameter = -1;
	}
	public GokCismi(int temperature, int diameter, String name) {
		this.temperature = temperature;
		this.diameter = diameter;
		this.name = name;
	}
	
	public void sesVer() {
		System.out.println("This is " + this.name
				+ ". Temperature: " + this.temperature
				+ "C, Diameter: " + this.diameter);
	
	}
}
