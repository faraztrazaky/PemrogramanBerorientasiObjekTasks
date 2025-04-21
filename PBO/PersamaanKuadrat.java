public class PersamaanKuadrat {
private int a, b, c;
private double D; // Determinan

// Konstruktor
public PersamaanKuadrat(int a, int b, int c) {
this.a = a;
this.b = b;

this.c = c;
this.D = (b * b) - (4 * a * c); // Menghitung Determinan
}

// Metode untuk menghitung akar kuadrat secara manual (Newton-Raphson)
private double akarKuadrat(double angka) {
if (angka < 0)
return -1; // Mengembalikan -1 jika angka negatif

double x = angka;
double y = 1;
double e = 0.00001; // Akurasi

while (x - y > e) {
x = (x + y) / 2;
y = angka / x;
}
return x;
}

// Method untuk mencari akar persamaan kuadrat
public void hitungAkar() {
double akarD = akarKuadrat(Math.abs(D)); // Ambil nilai absolut untuk akar imajiner

if (D > 0) {
double x1 = (-b + akarD) / (2 * a);
double x2 = (-b - akarD) / (2 * a);
System.out.println("Akar-akar persamaan kuadrat:");
System.out.println("x1 = " + x1);

System.out.println("x2 = " + x2);
} else if (D == 0) {
double x = -b / (2.0 * a);
System.out.println("Akar persamaan kuadrat hanya satu:");
System.out.println("x = " + x);
} else {
double realPart = -b / (2.0 * a);
double imaginaryPart = akarD / (2 * a);
System.out.println("Persamaan memiliki akar imajiner:");
System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
}
}
}