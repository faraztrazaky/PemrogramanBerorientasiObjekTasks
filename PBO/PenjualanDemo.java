import java.util.Scanner;

public class PenjualanDemo {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
char ulang;
do {
System.out.print("Masukkan kode : ");
String kode = scanner.next();
scanner.nextLine();

System.out.print("Masukkan Nama : ");
String nama = scanner.nextLine();

System.out.print("Masukkan harga : ");
float harga = scanner.nextFloat();

System.out.print("Masukkan jumlah : ");
int jumlah = scanner.nextInt();

Penjualan barang = new Penjualan(kode, nama, harga, jumlah);
barang.cetakNota();

System.out.print("Input data lagi [Y/T]? ");
ulang = scanner.next().charAt(0);
} while (ulang == 'Y' || ulang == 'y');

scanner.close();
}
}