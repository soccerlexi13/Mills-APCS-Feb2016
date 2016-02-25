
/**
 * This runs the objects in the superclass Vehicles
 * chapter 9.3
 */
public class VehicleRunner
{
    public static void main(String[] args){
        // Create an instance of Convertible
        Convertible marysCar = new Convertible("yellow", 2015, "Mini", "ragtop");
        System.out.println(marysCar);
        // Create an instance of Motorcycle
        Motorcycle joesBike = new Motorcycle("yellow", 1600);
        System.out.println(joesBike);
        // Repaint the car
        paintShop(marysCar,"blue");
        System.out.println(marysCar);
        // Now repaint the motorcycle
        paintShop(joesBike, "green");
        System.out.println(joesBike);
        Vehicles aVehicle= new Motorcycle("purple", 1600);
        Vehicles moves= new Convertible("gray", 1994, "Miata", "ragtop");
        System.out.println(aVehicle);
        System.out.println(moves);
        paintShop(aVehicle, "red");
        paintShop(moves, "black");
        System.out.println(aVehicle);
        System.out.println(moves);
        crossBridge(joesBike);
        crossBridge(moves);
        crossBridge(aVehicle);
    }

    /*
     * Method to demonstrate polymorphism and object casting
     * Takes all types of objects in vehicle class
     */
    public static void paintShop(Vehicles v, String color){  

        // use instance of to set fee
        if (v instanceof Car) 
            System.out.println("\nThat will cost you $1,000 to repaint a car");
        else System.out.println("\nThat will cost you $500 to repaint a Motorcycle");
        /*
         * If it is a convertible we need to raise the top before painting
         * For that we will use casting of the object
         */
        if (v instanceof Convertible)
            ((Convertible)v).openRoof();
        // Now paint it
        v.setColor(color);
    }
    /*
     * Method to charge driver for crossing the bridge
     * Takes all types of objects in vehicle class
     */
    public static void crossBridge(Vehicles v){
        if (v instanceof Car){
            System.out.println("That'll be $5 to cross please.");
        }
        else if (v instanceof Motorcycle){
            System.out.println("That'll be $2 to cross please.");
        }
    }
}
