public class MyVarFloat {  
    // Variabel statis
    private static int integerVar;  
    private static float floatVar;  
    private static String stringVar;  

    // Method untuk menginisialisasi nilai variabel
    public static void initializeValues(int integerValue, float floatValue, String stringValue) {  
        integerVar = integerValue;  
        floatVar = floatValue;  
        stringVar = stringValue;  
    }  

    // Method untuk menampilkan nilai variabel
    public static void displayValues() {  
        System.out.println("Nilai Integer : " + integerVar);  
        System.out.println("Nilai Float   : " + floatVar);  
        System.out.println("Nilai String  : " + stringVar);  
    }  

    // Method utama (entry point)
    public static void main(String[] args) {  
        // Menginisialisasi nilai variabel
        initializeValues(10, 20.5f, "Hello, World!");  

        // Menampilkan nilai yang telah diinisialisasi
        displayValues();  
    }  
}