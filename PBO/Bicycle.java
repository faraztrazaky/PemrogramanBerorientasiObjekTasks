public class Bicycle{
    int speed=1;
    int gear=1;
    void changeGear(int newValue){
        gear=gear+newValue;
        System.out.print("\nGear  : "+gear);
    }
    void speedUp(int increment){
        speed=speed+increment;
        System.out.println("\nSpeed :"+speed);
    }
}