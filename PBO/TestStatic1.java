public class TestStatic1 {
public static void main(String[] args) {
// Create an instance of TestStatic to access non-static members
TestStatic ts = new TestStatic();

// Call satu() method (non-static)
ts.satu();

// Call dua() method (static)
TestStatic.dua();

// Print attributes a through e
System.out.println("\nPrinting attributes from TestStatic1:");
System.out.println("a: " + ts.a);
System.out.println("b: " + TestStatic.b);
System.out.println("c: " + ts.c);
System.out.println("d: " + ts.d);
System.out.println("'e' tidak bisa dipanggil karena private");
}
}