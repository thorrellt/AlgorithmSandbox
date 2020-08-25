package sourceFiles;

public class SelectSort extends ArraySort{
    
    public SelectSort(int[] testArray) {
        super(testArray);        
    }
    
    public void runSelectSort () {

        for (int unsortedPartition =  sortingArray.length - 1; 
             unsortedPartition > 0; unsortedPartition-- ) {
            
            int largestIndex = 0;
            
            for (int i = 0; i <= unsortedPartition; i++) {
                if(sortingArray[i] > sortingArray[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(largestIndex, unsortedPartition);
        }
    }

}
