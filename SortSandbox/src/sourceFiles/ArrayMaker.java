package sourceFiles;

import java.util.Random;


public class ArrayMaker {
    
    private int length;
    private Random rand;
    
    public ArrayMaker() {
        rand = new Random();
    }
    
    public int[] makeArray() {

        //length b/t 6-10
        this.length = getRandomRange(6, 10);
        int[] outputArray = new int[this.length];

        fillArray(outputArray);
        
        return outputArray;
    }
    
    private int[] fillArray(int[] outputArray)
    {    
        for (int i=0; i< outputArray.length; i++) {
            outputArray[i] = getRandomRange(-25, 25);            
        }
        return outputArray;
    }
    
    private int getRandomRange(int min, int max)
    {    
        int randomLength = rand.nextInt(max-min+1)+min;
        return randomLength;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public static void print(int[] outputArray) {
        for (int i = 0; i < ((outputArray.length * 4) + 1); i ++) {
            System.out.printf("%s", "-");
        }
        System.out.println();
            
        
        
        System.out.printf("%s", "|");
        for(int number: outputArray) {
            System.out.printf("%3d", number);
            System.out.printf("%s", "|");
            
        }
        System.out.println();
        
        for (int i = 0; i < ((outputArray.length * 4) + 1); i ++) {
            System.out.printf("%s", "-");
        }
        System.out.println();
    }

}
