public class CrateArray {
    public int array(int[] arr,int element){
        int index=0;
        for(int i=0;i<arr.length;i++){
        if(element==arr[i]){
            index=i;
        }
        }
        return index;
    }
    public int array(String[] array,String element){
        int found =0;
        int index=0;
        for(String oneElement:array){
            if (oneElement.equals(element)){
            found=index;
            }
        }index++;
        return found;
    }
}
