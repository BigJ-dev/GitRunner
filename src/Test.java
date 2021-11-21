import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> unsorted = new ArrayList<>();
        int arr[] = {-5,-1,1,2,3};
        Arrays.sort(arr);
        while (arr.length != 0) { // unless there is any element in arr
            System.out.print(arr[0] + " "); // print the first element
            arr = Arrays.copyOfRange(arr, 1, arr.length); // clone the remaining elements
            arr = reverseArray(arr); // reverse the array
        }
    }
    private static int[] reverseArray(int[] arr) {
        int n = arr.length - 1;
        int[] temp = new int[n + 1];
        int i = 0;
        while (i <= n) {
            temp[i] = arr[n - i];
            i++;
        }
        return temp;
    }
}
