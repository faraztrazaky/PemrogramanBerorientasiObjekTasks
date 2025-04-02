import java.util.Scanner;

public class Nilai {
    String nim, nama;
    float nilaiUts, nilaiUas, nilaiTugas, nilaiAkhir;
    String nHuruf, predikat;
    Scanner input = new Scanner(System.in);

    // Constructor kosong
    public Nilai() {
    }

    // Constructor dengan parameter
    public Nilai(String nim, String nama, float nilaiTugas, float nilaiUts, float nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    void inputData() {
        System.out.print("NIM            : ");
        nim = input.nextLine();
        System.out.print("Nama           : ");
        nama = input.nextLine();
        System.out.print("Nilai Tugas    : ");
        nilaiTugas = input.nextFloat();
        System.out.print("Nilai UTS      : ");
        nilaiUts = input.nextFloat();
        System.out.print("Nilai UAS      : ");
        nilaiUas = input.nextFloat();
        input.nextLine(); // membersihkan newline
    }

    String getNilaiHuruf(float nilai) {
        if (nilai >= 85)
            return "A";
        else if (nilai >= 80)
            return "AB";
        else if (nilai >= 70)
            return "B";
        else if (nilai >= 65)
            return "BC";
        else if (nilai >= 60)
            return "C";
        else if (nilai >= 40)
            return "D";
        else
            return "E";
    }

    String getPredikat(String huruf) {
        switch (huruf) {
            case "A":
                return "Apik Banget";
            case "AB":
                return "Apik";
            case "B":
                return "Baik";
            case "BC":
                return "Baik Cukup";
            case "C":
                return "Cukup";
            case "D":
                return "Dablek";
            case "E":
                return "Elek";
            default:
                return "-";
        }
    }

    // Menghitung nilai akhir, nilai huruf, dan predikat
    void hitungNilai() {
        nilaiAkhir = (nilaiTugas * 0.3f) + (nilaiUts * 0.3f) + (nilaiUas * 0.4f);
        nHuruf = getNilaiHuruf(nilaiAkhir);
        predikat = getPredikat(nHuruf);
    }

    // Menampilkan hasil nilai
    void cetakNilai() {
        System.out.println("\n=== Hasil Nilai ===");
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Tugas  : " + nilaiTugas);
        System.out.println("Nilai UTS    : " + nilaiUts);
        System.out.println("Nilai UAS    : " + nilaiUas);
        System.out.println("Nilai Akhir  : " + nilaiAkhir);
        System.out.println("Nilai Huruf  : " + nHuruf);
        System.out.println("Predikat     : " + predikat);
    }
    
    // Menampilkan judul tabel
    void judul() {
        System.out.println("\nDaftar Nilai PBO");
        System.out.println("-----------------");
        System.out.println("NIM\tNama\tN.Tgs\tN.Uts\tN.Uas\tN.Akhir\tN.Huruf\tPredikat");
    }

    // Menampilkan daftar nilai dalam format tabel
    void daftarNilai() {
        System.out.println(nim + "\t" + nama + "\t" + nilaiTugas + "\t" + nilaiUts + "\t" + nilaiUas + "\t" + nilaiAkhir + "\t" + nHuruf + "\t" + predikat);
    }
}
