package search;

public class Main {
    public static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] a, int firstIndex, int toIndex, int key) {
        int low = firstIndex;
        int high = toIndex-1;

        while (low <= high) {
            int mid = (low+high)/2;
            int midVal = a[mid];

            if(key < midVal)
                high = mid-1;
            else if(key > midVal)
                low = mid+1;
            else
                return mid;
        }

        return -1;
    }
}
