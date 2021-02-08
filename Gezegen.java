
class Gezegen extends GokCismi {
	public Gezegen(int temperature, int diameter, String name) {
		super(temperature, diameter, name);
	}
	public Gezegen() {
		super();
	}
	
	// linked list are not used in this example
	// we need to find a solution for our code to work as intended
	// when new "uydu"s are added
	// we'll create a new array and copy the old array to it every time the array runs out of space
	Uydu [] uydular = new Uydu[10];
	int i = 0;
	public int uyduSayisi = 0;
	public void ekle(Uydu u) {
		uydular[i++] = u;
		uyduSayisi++;
		if(i+1 == this.uydular.length) {
			Uydu [] temp = new Uydu[this.uydular.length + 10];
			for(int j=0; j < this.uydular.length ; j++) {
			temp[j] = uydular[j];	
			}
			Uydu [] uydular = new Uydu[this.uydular.length + 10];
			for (int k = 0; k < this.uydular.length; k++) {
				uydular[k] = temp[k];
			}
			uyduSayisi++;
			}
		// the code above creates an array with extra 10 slots so that it can contain new "uydu"s
		// since a new array is created at every (10k+1)# uydu, it is slow and inefficient
		// linked lists are a much better solution for such cases
		}
	
	}
