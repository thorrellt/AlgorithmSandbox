package sourceFiles;

public class BubbleSort extends ArraySort{
    
    //public int[] sortingArray;
    
    
    public BubbleSort(int[] testArray) {
        super(testArray);
    }
    
    public void runBubbleSort() {
        
        for(int unsortedPartition = sortingArray.length-1; unsortedPartition > 0; unsortedPartition--) {

            for(int i = 0; i < unsortedPartition; i++) {
                
                if(sortingArray[i] > sortingArray[i+1]) { 
                    swap(i, i+1);
                }
            }
        }

       
    }
    
    /*
    private void swap(int a) {
        
        int temp = bubbleArray[a+1];
        bubbleArray[a+1] = bubbleArray[a];
        bubbleArray[a] = temp;
        
    }*/

    /*
    public int[] getArray(){
        return bubbleArray;
    }*/
}
