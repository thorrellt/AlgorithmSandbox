package sourceFiles;

public class ArraySort {
    
    protected int[] sortingArray;
    
    public ArraySort() {
        sortingArray = null;
    }
    
    public ArraySort(int[] testArray) {
        sortingArray = testArray.clone();        
    }
    
    
    protected void swap(int a) {
        
        int temp = sortingArray[a+1];
        sortingArray[a+1] = sortingArray[a];
        sortingArray[a] = temp;
        
    }
    
    protected void swap(int a, int b) {
        
        int temp = sortingArray[b];
        sortingArray[b] = sortingArray[a];
        sortingArray[a] = temp;
        
    }

    public int[] getArray(){
        return sortingArray;
    }
    
    public int getCell(int index) {
        return sortingArray[index];
    }
    
    public void print() {
        for (int i = 0; i < ((sortingArray.length * 4) + 1); i ++) {
            System.out.printf("%s", "-");
        }
        System.out.println();
            
        
        
        System.out.printf("%s", "|");
        for(int number: sortingArray) {
            System.out.printf("%3d", number);
            System.out.printf("%s", "|");
            
        }
        System.out.println();
        
        for (int i = 0; i < ((sortingArray.length * 4) + 1); i ++) {
            System.out.printf("%s", "-");
        }
        System.out.println();
    }

}
