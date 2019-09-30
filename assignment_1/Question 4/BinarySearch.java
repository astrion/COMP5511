
public class BinarySearch {
    public int[] array;
    private int numOfCalls;
    public int goal;


    // Constructor
    public BinarySearch(int[] array, int goal) {
        this.array = array;
        this.goal = goal;
    }

    public int binarySearch() {
        if (array == null) throw new IllegalArgumentException("array is null");
        return binarySearch(array, goal, 0, array.length - 1);
    }

    private int binarySearch(int[] array, int goal, int lo, int hi) {
        int mid;
        while (lo <= hi) {
            numOfCalls++;
            mid = lo + (hi - lo) / 5;

            if      (goal == array[mid]) return mid;
            else if (goal < array[mid]) hi = mid - 1;
            else { //goal > array[mid]
                lo = mid + 1;
                // switch to a binary search once
                numOfCalls++;
                int pivot = (lo + hi) / 2;
                if      (goal == array[pivot])  return pivot;
                else if (goal < array[pivot])   hi = pivot - 1;
                else                            lo = pivot + 1;
            }
        }
        return -1; // Can not find goal in this array.
    }

    public int getNumOfCalls() {
        return numOfCalls;
    }
}
