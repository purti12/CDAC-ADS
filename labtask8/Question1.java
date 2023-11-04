package labtask8;
public class Question1 {
    public static int binarySearch(int[] arr, int key) {
        int start= 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,9,13,17,21,25,29,33,37};
        int key = 39;
        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}



