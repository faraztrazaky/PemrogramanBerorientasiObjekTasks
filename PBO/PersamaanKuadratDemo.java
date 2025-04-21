import java.util.Scanner;

public class PersamaanKuadratDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Masukkan nilai a: ");
            int a = scanner.nextInt();
            System.out.print("Masukkan nilai b: ");
            int b = scanner.nextInt();
            System.out.print("Masukkan nilai c: ");
            int c = scanner.nextInt();

            // Membuat objek dan memanggil metode
            PersamaanKuadrat persamaan = new PersamaanKuadrat(a, b, c);
            persamaan.hitungAkar();

            System.out.print("Input data lagi [Y/T]? ");
            ulang = scanner.next();
        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Program selesai.");
        scanner.close();
    }
}
