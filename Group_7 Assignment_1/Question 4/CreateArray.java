import java.util.Random;

public class CreateArray {

    // create a sorted array which contains n numbers.
    public static int[] createArray(int n) {
        if (n < 0) throw new IllegalArgumentException("n must larger or equal than 1");
        int[] array = new int[n];
        Random rand = new Random();

        if (n == 0) return array;   // if n = 0, return empty array.
        else {   // n > 0
            array[0] = rand.nextInt(10)+1;     // generate a random double number range from 1 - 10
            for (int i = 1; i < n; i++) {
                array[i] = array[i-1] + rand.nextInt(5)+1; // add a random number from 1 - 5
            }
        }
        return array;
    }
}
