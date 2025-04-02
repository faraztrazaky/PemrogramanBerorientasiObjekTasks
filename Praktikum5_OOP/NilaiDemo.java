public class NilaiDemo {
    public static void main(String[] a) {
        Nilai nilaiku = new Nilai();
        nilaiku.nim = "A11.2023.00001";
        nilaiku.nama = "Najwa";
        nilaiku.nilaiTugas = 90;
        nilaiku.nilaiUts = 87;
        nilaiku.nilaiUas = 89;
        nilaiku.hitungNilai();
        nilaiku.cetakNilai();

        Nilai nilaimu = new Nilai();
        // nilaimu.nim = "A11.2025.00002";
        nilaimu.inputData();
        nilaimu.hitungNilai();
        nilaimu.cetakNilai();

        Nilai nilainya = new Nilai("A11.2023.00003", "Anis", 88, 90, 75);
        nilainya.hitungNilai();
        nilainya.cetakNilai();

        Nilai nilaidia = new Nilai();
        nilaidia.inputData();
        nilaidia.hitungNilai();
        nilaidia.cetakNilai();
    }
}