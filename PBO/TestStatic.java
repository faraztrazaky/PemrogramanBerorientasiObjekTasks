public class TestStatic{
int a = 70;
static int b = 40;
protected int c = 20;
public int d = 60;
private int e = 70;

void satu(){
dua();
System.out.println("satu............");
System.out.println("satu............a: " + a);
System.out.println("satu............b: " + b);

System.out.println("satu............c: " + c);
System.out.println("satu............d: " + d);
System.out.println("satu............e: " + e);
}

static void dua(){
//satu(); --> error static call non static
System.out.println("dua............" + b);
//System.out.println("dua............" + a); --> error static call var non static
}

public static void main(String[] a){
//satu(); --> error static call non static
dua();
}
}