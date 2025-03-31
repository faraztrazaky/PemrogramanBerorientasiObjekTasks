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
            nHuruf = "A";
        else if (nilai >= 80)
            nHuruf = "AB";
        else if (nilai >= 70)
            nHuruf = "B";
        else if (nilai >= 65)
            nHuruf = "BC";
        else if (nilai >= 60)
            nHuruf = "C";
        else if (nilai >= 40)
            nHuruf = "D";
        else
            nHuruf = "E";
        return nHuruf;
    }

    String getPredikat(String huruf) {
        switch (huruf) {
            case "A":
                predikat = "Apik";
                break;
            case "AB":
                predikat = "Apik Banget";
                break;
            case "B":
                predikat = "Baik";
                break;
            case "BC":
                predikat = "Baik Cukup";
                break;
            case "C":
                predikat = "Cukup";
                break;
            case "D":
                predikat = "Dablek";
                break;
            case "E":
                predikat = "Elek";
                break;
            default:
                predikat = "-";
        }
        return predikat;
    }

    // Tambahan function hitungNilai()
    void hitungNilai() {
        nilaiAkhir = (nilaiTugas * 0.3f) + (nilaiUts * 0.3f) + (nilaiUas * 0.4f);
        nHuruf = getNilaiHuruf(nilaiAkhir);
        predikat = getPredikat(nHuruf);
    }

    // Tambahan function cetakNilai()
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
}
