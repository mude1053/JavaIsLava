public class Objective {
   private int size;
    Objective(){
        this.size=10;

    }
    Objective(int size){
        this.size=size;
    }
    public int[] initalArray(){
        int[] returnArray=new int[this.size];
        for (int i=0; i<this.size;i++){
            returnArray[i]=i+1;
        }
        return returnArray;
    }
     public void printOddIndex(int[] array){
        this.size=size;
        for(int i=0;i<array.length;i++){
            if(i%2!=0){
                System.out.println(array[i]);
            }
        }
     }
     public void printEvenIndex(int[] array){
        for (int i=0; i<array.length;i++){
            if (i%2==0){
                System.out.println(array[i]);
            }
        }
     }

     public void printLargestNum(int[] array){

     }
}
