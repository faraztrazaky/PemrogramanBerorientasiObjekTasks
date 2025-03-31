public class Matematika {
    int a, b, hasil;
    double hsl;

    // Konstruktor default
    public Matematika() {}

    // Konstruktor dengan parameter
    public Matematika(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Operasi matematika dengan integer
    void pertambahan() {
        hasil = a + b;
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasil);
    }

    void pengurangan() {
        hasil = a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
    }

    void perkalian() {
        hasil = a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasil);
    }

    void pembagian() {
        if (b == 0) {
            System.out.println("Error: Pembagian oleh nol tidak diperbolehkan.");
        } else {
            hsl = (double) a / b;
            System.out.println("Pembagian: " + a + " / " + b + " = " + hsl);
        }
    }

    // Overloading metode pertambahan
    void pertambahan(float a, float b) {
        hsl = a + b;
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hsl);
    }

    void pertambahan(double a, double b, double c) {
        hsl = a + b + c;
        System.out.println("Pertambahan: " + a + " + " + b + " + " + c + " = " + hsl);
    }

    // Overloading metode pengurangan
    void pengurangan(float a, float b) {
        hsl = a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hsl);
    }

    // Overloading metode perkalian
    void perkalian(float a, float b) {
        hsl = a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hsl);
    }

    // Overloading metode pembagian
    void pembagian(float a, float b) {
        if (b == 0) {
            System.out.println("Error: Pembagian oleh nol tidak diperbolehkan.");
        } else {
            hsl = a / b;
            System.out.println("Pembagian: " + a + " / " + b + " = " + hsl);
        }
    }
}