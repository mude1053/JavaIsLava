public class Dice {
    private int numOfFaces;

    Dice(){
        this.numOfFaces=6;
    }
    Dice(int numOfFaces){
   this.numOfFaces=numOfFaces;
    }

    public int getNumOfFaces() {
        return numOfFaces;
    }

    public int printRandom(){
        int result;
        double randomNum= Math.random()*this.numOfFaces;
        result=(int)randomNum+1;
       return result;
    }
}
