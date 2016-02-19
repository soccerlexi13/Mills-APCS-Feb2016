
/**
 * Homework assignment: create Trucks class
 * 
 * @author  Alexis Scheerer
 * @version 2/18/16
 */
public class Trucks extends Vehicles //Trucks is the name given in the assignment
{
    //instance variables for Trucks
    private boolean trailer;
    private int numExhaustStacks;
    /**
     * Constructor for general Trucks object
     */
    public Trucks(){
    }
    /**
     * Constructor for truck with trailer
     */
    public Trucks(boolean trailer){
        this.trailer=trailer;
        this.numExhaustStacks=0;
    }
    /**
     * Constructor for truck with trailer and exhaust stacks
     */
    public Trucks(boolean trailer, int numExhaustStacks){
        this.trailer=trailer;
        this.numExhaustStacks=numExhaustStacks;
    }
    /**
     * Constructor for new truck with trailer and exhaust stacks
     */
    public Trucks(boolean trailer, int numExhaustStacks, String color){
        super(color);
        this.trailer=trailer;
        this.numExhaustStacks=numExhaustStacks;
    }
    /**
     * Constructor for used truck with trailer and exhaust stacks
     */
    public Trucks(boolean trailer, int numExhaustStacks, String color, int currentMileage){
        super(color, currentMileage);
        this.trailer=trailer;
        this.numExhaustStacks=numExhaustStacks;
    }
    /**
     * Overrides Vehicle changeOil for Trucks (requires more mileage before changing)
     */
    public void changeOil(){
        if (this.getCurrentMileage() - this.getLastOilChange() > 15000){
            System.out.println("Hey buddy, time to change your oil");
            this.setLastOilChange(this.getCurrentMileage());
        }
    }
    /**
     * Overrides Vehicle toString for Trucks
     */
    public String toString(){
        String output = "\nTruck\n" + super.toString() + " Has a trailer? " + this.trailer 
            + "\n Number of exhaust stacks: " + this.numExhaustStacks;
        return output;
    }
}
