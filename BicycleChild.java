public class BicycleChild extends Bicycle {
    public int tireSize;
    public String handleBar;

    public BicycleChild(int gear, int speed,int tireSize,String handleBar){
        super(gear,speed);
        this.handleBar=handleBar;
        this.tireSize=tireSize;
    }
    public void changeTireSize(int newTireSize){
        this.tireSize=newTireSize;
    }
    public String toString(){
        return (super.toString()+"Tire Size "+this.tireSize+"\nHandleBar "+this.handleBar);
    }

}
