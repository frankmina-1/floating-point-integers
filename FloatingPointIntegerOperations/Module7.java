import java.lang.*;
/**
 * Programming Module 7 
 * Fills two arrays of size 1,000,000, one with floats, one with integers
 * iterates through each array, changing the current index to the average of the
 * previous and next index values. 
 * Records the time in milliseconds for each operation. 
 *
 * @author Frank Mina
 * @version 1.0
 */
public class Module7
{
    public static void floatOperations(){
        long start = System.currentTimeMillis();
        float[] floatArray = new float[1000000];
        for(int i = 0; i < floatArray.length; i++){
            float min = 1.5f;
            float max = 50.7f;
            float float1 = (float)Math.floor(Math.random() * (max - min + 1) + min);
            floatArray[i] = float1;
        }

        long endFill = System.currentTimeMillis();
        long timeFill = endFill - start;
        System.out.println("Time taken to fill the float array: " + timeFill + " milliseconds.");
        long startIterate = System.currentTimeMillis();
        for(int i = 1; i < floatArray.length - 1; i++){

        }
        long endIterate = System.currentTimeMillis();

        long timeIterate = endIterate - startIterate;
        System.out.println("Time taken to Iterate through the float array: " + timeIterate + " milliseconds.");
        long startAvg = System.currentTimeMillis();
        for(int i = 1; i < floatArray.length - 1; i++){
            floatArray[i] = (floatArray[i-1] + floatArray[i+1]) / 2;
            //System.out.println("Changing float index " + i + " to " + floatArray[i]);
        }
        long endAvg = System.currentTimeMillis();
        long timeAvg = endAvg - startAvg;
        System.out.println("Time taken to adjust values in the float array: " + timeAvg + " milliseconds.");
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time taken for float operations: " + time + " milliseconds"); 
    }

    public static void intOperations(){
        long start = System.currentTimeMillis();
        int[] intArray = new int[1000000];
        for(int i = 0; i < intArray.length; i++){
            int min = 1;
            int max = 50;
            int int1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            intArray[i] = int1;
        }
        long endFill = System.currentTimeMillis();
        long timeFill = endFill - start;
        System.out.println("Time taken to fill the integer array: " + timeFill + " milliseconds.");

        long startIterate = System.currentTimeMillis();
        for(int i = 1; i < intArray.length - 1; i++){

        }
        long endIterate = System.currentTimeMillis();
        long timeIterate = endIterate - startIterate;

        System.out.println("Time taken to iterate through the integer array: " + timeIterate + " milliseconds.");

        
        long startAvg = System.currentTimeMillis();
        for(int i = 1; i < intArray.length - 1; i++){
            intArray[i] = (intArray[i-1] + intArray[i+1]) / 2;
            //System.out.println("Changing integer index " + i + " to " + intArray[i]);
        }
        long endAvg = System.currentTimeMillis();
        long timeAvg = endAvg - startAvg;
        System.out.println("Time taken to adjust values in the integer array: " + timeAvg + " milliseconds.");

        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("Time taken for integer operations: " + time + " milliseconds");

    }

    public static void main(String[] args){        

        intOperations();

        System.out.println();

        floatOperations();

    }
}
