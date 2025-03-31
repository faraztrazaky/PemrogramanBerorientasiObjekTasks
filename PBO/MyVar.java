public class MyVar {  
    // Variabel instance
    private int integerVar;  
    private double doubleVar;  
    private String stringVar;  

    // Konstruktor untuk menginisialisasi variabel
    public MyVar(int integerVar, double doubleVar, String stringVar) {  
        this.integerVar = integerVar;  
        this.doubleVar = doubleVar;  
        this.stringVar = stringVar;  
    }  

    // Method untuk menampilkan nilai variabel
    public void displayValues() {  
        System.out.println("Nilai Integer : " + integerVar);  
        System.out.println("Nilai Double  : " + doubleVar);  
        System.out.println("Nilai String  : " + stringVar);  
    }  

    // Method utama (entry point)
    public static void main(String[] args) {  
        // Membuat objek MyVar dan menampilkan nilai variabelnya
        MyVar myVar = new MyVar(10, 20.5, "Hello World!");  
        myVar.displayValues();  
    }  
}


 

