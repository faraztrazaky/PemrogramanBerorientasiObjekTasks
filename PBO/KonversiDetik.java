public class KonversiDetik {

    // Kelas Tengah
    public class Konversi {
        public void cetakKonversiTengah() {
            System.out.println("Program Konversi Detik ke Hari, Jam, Menit, Detik");
        }

        // Kelas Dalam
        public class Hitung {
            private int hari, jam, menit, detik;

            public void hitungKonversi(int totalDetik) {
                cetakKonversiTengah(); // Memanggil method di class tengah

                hari = totalDetik / 86400;
                int sisaDetik = totalDetik % 86400;

                jam = sisaDetik / 3600;
                sisaDetik = sisaDetik % 3600;

                menit = sisaDetik / 60;
                detik = sisaDetik % 60;

                // Menampilkan hasil konversi
                System.out.println("Detik : " + totalDetik);
                System.out.println("Hari  : " + hari);
                System.out.println("Jam   : " + jam);
                System.out.println("Menit : " + menit);
                System.out.println("Detik : " + detik);
            }
        }
    }
}
