public class Bicycle {
    protected int gear;
    protected  int speed;

     Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void speedUp(int increase){
        this.speed=this.speed+increase;
    }
    public void slowDown(int decrease){
        this.speed=this.speed-decrease;
    }
    public String toString(){
        return ("Number of gears"+this.gear+"\n"
        +"Bike's speed is "+this.speed);
    }

}
