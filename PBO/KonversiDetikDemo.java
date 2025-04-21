import java.util.Scanner;

public class KonversiDetikDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = scanner.nextInt();

            KonversiDetik kd = new KonversiDetik();
            KonversiDetik.Konversi konversi = kd.new Konversi();
            KonversiDetik.Konversi.Hitung hitung = konversi.new Hitung();

            hitung.hitungKonversi(totalDetik);

            System.out.print("Input data lagi [Y/T]? ");
            ulang = scanner.next();
        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Program selesai.");
        scanner.close();
    }
}
