public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        Matematika mtk1 = new Matematika(357, 73);
        
        // Menetapkan nilai a dan b pada objek mtk
        mtk.a = 221;
        mtk.b = 9;
        
        // Operasi matematika untuk objek mtk
        mtk.pertambahan();
        mtk.pengurangan();
        mtk.perkalian();
        mtk.pembagian();
        
        // Overloading pembagian dengan float
        mtk.pembagian(10.9f, 21.77f);
        
        // Operasi matematika untuk objek mtk1
        mtk1.pertambahan();
        mtk1.pengurangan();
        mtk1.perkalian();
        mtk1.pembagian();
        
        // Membuat objek mtk2
        Matematika mtk2 = new Matematika();
        
        // Memanggil metode pertambahan dengan satu parameter
        mtk2.pertambahan(777.79f, 0);
    }
}














