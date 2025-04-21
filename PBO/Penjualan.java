public class Penjualan {
private String kode;
private String nama;
private float harga;
private int jumlah;

public Penjualan() {
}

public Penjualan(String kode, String nama, float harga, int jumlah) {
this.kode = kode;
this.nama = nama;
this.harga = harga;
this.jumlah = jumlah;
}

public void setData(String kode, String nama, float harga, int jumlah) {

this.kode = kode;
this.nama = nama;
this.harga = harga;
this.jumlah = jumlah;
}

public float getTotalPembelian() {
return harga * jumlah;
}

public String getBonus() {
if (harga >= 500000 && jumlah > 5) {
return "Setrika";
} else if (harga >= 100000 && jumlah > 3) {
return "Payung";
} else if (harga >= 50000 && jumlah > 2) {
return "ballpoint";
} else {
return "tidak ada bonus";
}
}

public void cetakNota() {
System.out.println("kode : " + kode);
System.out.println("nama : " + nama);
System.out.println("jumlah : " + jumlah);
System.out.println("total pembelian : Rp" + getTotalPembelian());
System.out.println("bonus : " + getBonus());
}

}