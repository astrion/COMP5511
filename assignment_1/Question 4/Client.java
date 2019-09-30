import java.util.Random;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        int[] array;
        int sumPureBinary = 0, sumModifiedBinary = 0;
        double avgPureBinary = 0.0, avgModifiedBinary = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please input number of elements in the array, and number of experiments");

        int n = in.nextInt();   // how many numbers in the array.
        int numOfExp = in.nextInt(); // number of experiments

        System.out.println("Index of goal,  number of Calls Pure,   number of Calls Modified");

        for (int i = 0; i < numOfExp; i ++) {
            // create a sorted array with n numbers
            array = CreateArray.createArray(n);

            // generate a random number in the array range.
            int arrayRange = array[array.length - 1]; // the largest number in the array.
            Random rand = new Random();
            int goal = rand.nextInt(arrayRange);  // generate a random number in the array range.


            // Pure Binary Search
            PureBinarySearch pbs = new PureBinarySearch(array, goal);
            int indexOfGoal = pbs.pureBinarySearch();
            int numOfCalls = pbs.getNumOfCalls();
            sumPureBinary += numOfCalls;


            // Modified Binary Search
            BinarySearch bs = new BinarySearch(array, goal);
            int indexOfGoal2 = bs.binarySearch();
            int numOfCalls2 = bs.getNumOfCalls();
            sumModifiedBinary += numOfCalls2;

            System.out.printf("%10d, %14d, %20d \n",indexOfGoal, numOfCalls, numOfCalls2);
        }

        avgPureBinary = (double)sumPureBinary / numOfExp;
        avgModifiedBinary = (double)sumModifiedBinary / numOfExp;
        System.out.println();
        System.out.println("The average number of calls in PureBinary is " + avgPureBinary);
        System.out.println("The average number of calls in ModifiedBinary is " + avgModifiedBinary);
    }
}
