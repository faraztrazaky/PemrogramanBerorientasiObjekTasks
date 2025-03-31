public class Mobil2{
	int roda=4;String namaMobil;
	int body=1;
	static int mesin=1;
	static void maju(){
		System.out.println("Maju...");
	}
	void mundur(){
		System.out.println("Mundur...");
	}
	void belok(){
		System.out.println("Belok...");
	}
	void hidupkanMobil(String nama){
		System.out.println("Hidupkan Mobil : "+nama);
	}
	void matikanMobil(String nama){
		System.out.println("Matikan Mobil : "+nama);
	}
	void ubahGigi(String nama){
		System.out.println("Ubah Gigi Mobil : "+nama);
	}
}