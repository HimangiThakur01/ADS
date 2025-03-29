import java.util.*;
class AQ3 {
public static void main(String[] args) {
	int[] arr = {1, 3, 3, 3, 5, 6, 8};
	int key = 3;
	int index = binarySearch(arr, key);
	System.out.println("key found at index: " + index);
	
	int first = firstOccurrence(arr, key);
	int last = lastOccurrence( arr, key);
	System.out.println("First occurrence: " + first);
	System.out.println("Last occurrence: " + last);
	int count = (first == -1) ? 0 : (last - first + 1);
	System.out.println("Total count of key: " + count);
	
	// Peak Element
        int[] peakArr = {1, 2, 18, 4, 5, 0};
        int peak = findPeakElement(peakArr);
        System.out.println("Peak element: " + peak);
    }

    // Standard Binary Search
    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1; // Key not found
    }

    // First Occurrence using Binary Search
    static int firstOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                high = mid - 1; // Move left
				 } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    // Last Occurrence using Binary Search
    static int lastOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                low = mid + 1; // Move right
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    // Find a Peak Element using Binary Search
    static int findPeakElement(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) 
                high = mid; // Move left
            else 
                low = mid + 1; // Move right
        }
        return arr[low]; // Peak element
    }
}

