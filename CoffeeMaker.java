import com.sun.xml.internal.ws.resources.UtilMessages;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

public class CoffeeMaker {
    private int cupQuantity;
     int timer;
    CoffeeMaker(){
        this.timer=60;
        this.cupQuantity=6;

    }
    CoffeeMaker(int cupQuantity, int timer){
       this.cupQuantity=cupQuantity;
       this.timer=timer;
    }

    public void setTheTimer(int timer){
        this.timer=timer;
        System.out.println("Timer is: "+timer);

            }



    public void checkStatus(){


            if (timer==0){
                System.out.println("Coffee is ready!");
            }
            else{
                System.out.println("Not ready yet!");
            }


    }
    public void resetTimer(int timer){

        this.timer=0;
        System.out.println();

            }




}
