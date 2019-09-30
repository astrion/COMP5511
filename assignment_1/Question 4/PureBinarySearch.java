public class PureBinarySearch {
    public int[] array;
    private int numOfCalls = 0;
    public int goal;

    // Constructor
    public PureBinarySearch(int[] array, int goal) {
        this.array = array;
        this.goal = goal;
    }

    /**
     * pure Binary Search method
     * @return the index of goal in array.
     */
    public int pureBinarySearch() {
        if (array == null) throw new IllegalArgumentException("array is null");
        return pureBinarySearch(array, goal, 0, array.length - 1);
    }

    private int pureBinarySearch(int [] array, int goal, int lo, int hi) {
        int mid;
        while (lo <= hi) {
            numOfCalls++;
            mid = (lo + hi) / 2;
            int cmp = Integer.compare(goal, array[mid]);
            if (cmp == 0 ) return mid;          // find goal, then return mid.
            else if (cmp < 0) hi = mid - 1;     // if goal < array[mid], then go to the left part
            else lo = mid + 1;                  // else goal > array[mid], then go the right part.
        }
        return -1;   // Can not find goal in this array.
    }

    public int getNumOfCalls() {
        return numOfCalls;
    }
}
