
class GunesSistemi {

	public Yildiz yildiz = new Yildiz();
	public Gezegen [] gezegenler = new Gezegen[10];
	public int uyduSay = 0;
	
	int i = 0;
	public int gezegenSayisi = 0;
	public int yildizSayisi = 0;
	
	public void ekle(Gezegen g) {
		gezegenler[i++] = g;
		gezegenSayisi++;
		if(i+1 == this.gezegenler.length) {
			Gezegen [] temp = new Gezegen[this.gezegenler.length + 10];
			for(int j=0; j < this.gezegenler.length ; j++) {
			temp[j] = gezegenler[j];	
			}
			Gezegen [] gezegenler = new Gezegen[this.gezegenler.length + 10];
			for (int k = 0; k < this.gezegenler.length; k++) {
				gezegenler[k] = temp[k];
			}
			gezegenSayisi++;
			}
		}
	
	public void yildizEkle(Yildiz y) {
		if(yildiz.name.equals("isimsiz")) {
			this.yildiz = y;	
			//nameless "yildiz"s cannot be added to the system
		}
		else {
			System.out.println("No yildiz in the system. " + y.name +" cannot be added.");
		}
		
		}
	
	public void gezegenleriYazdir() {
		for(int sayac = 0; sayac < this.gezegenSayisi; sayac++) {
			System.out.print(this.gezegenler[sayac].name + " ");
		}
		//System.out.println(this.gezegenSayisi);
		System.out.print("\n");
	}
	
	public void uydulariYazdir() {
		for(int say = 0; say < this.gezegenSayisi; say++) {
			for(int say2 = 0; say2 < this.gezegenler[say].uyduSayisi; say2++) {
				System.out.print(this.gezegenler[say].uydular[say2].name + " ");
			}
		}
		System.out.print("\n");
		
	}
	
	public void gezegenSayisiniYazdir() {
		System.out.println(this.gezegenSayisi);
	}
	
	public void uyduSayisiniYazdir() {
		
		for(int say = 0; say < this.gezegenSayisi; say++) {
			uyduSay += this.gezegenler[say].uyduSayisi;
		}
		System.out.println(this.uyduSay);
	}
	}

