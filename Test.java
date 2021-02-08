
public class Test {

	public static void main(String[] args) {
		
		Gezegen g1 = new Gezegen(-210,49200,"Neptun"); // variables sicaklik-cap-isim
		Gezegen g2 = new Gezegen(60,6700,"Mars"); // degiskenler sicaklik-cap-isim
		Gunes gunes = new Gunes();
		Dunya dunya = new Dunya();
		Ay ay = new Ay();
		Uydu u1 = new Uydu(-235,2700,"Triton");
		Uydu u2= new Uydu(-40,11,"Phobos");
		Uydu u3= new Uydu(-60,400,"Proteus");
		GunesSistemi sistem = new GunesSistemi();
		dunya.ekle(ay); // Ay is added to the "uydu" list of Dunya
		g1.ekle(u1);
		g2.ekle(u2);
		g1.ekle(u3);
		sistem.ekle (g1); // g1 is added to the gezegen list of GunesSistemi
		sistem.ekle (g2);
		sistem.ekle (dunya);
		sistem.yildizEkle(gunes); // gunes is added as the yildiz of GunesSistemi
		Yildiz antares = new Yildiz(6000,150000,"antares","NotronYildizi");
		sistem.yildizEkle(antares); // prints an "error message" as a yildiz has been added before
		dunya.sesVer();
		ay.sesVer();
		gunes.sesVer();
		g1.sesVer();
		u1.sesVer();
		u2.sesVer();
		antares.sesVer();
		System.out.println(dunya.uyduSayisi);
		System.out.println(gunes.tip);
		sistem.gezegenleriYazdir(); // prints the gezegens in the system
		sistem.uydulariYazdir(); // prints the uydus in the system
		sistem.gezegenSayisiniYazdir(); // prints the number of gezegens in the system
		sistem.uyduSayisiniYazdir(); // prints the number of uydus in the system

	}

}
