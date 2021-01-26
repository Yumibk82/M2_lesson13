import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int x = 4;
        int result = ob.binarySearch(arr, x, 0, n - 1);
        if (result == -1) {
            System.out.println("Not found");
        } else System.out.println("Element found at index " + result);
    }

    public int binarySearch(int[] arr, int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, x, low, mid - 1);
            }
            return binarySearch(arr, x, mid + 1, high);
        }
        return -1;
    }
}
