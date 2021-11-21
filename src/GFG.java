// Java program to rearrange an array in minimum
// maximum form

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GFG
{
    static void rearrange(int[] arr, int n){
        int temp[] = arr.clone();
        int small = 0, large = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];
            flag = !flag;
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        List<Integer> unsorted = new ArrayList<Integer>();
        unsorted.add(-5);
        unsorted.add(-1);
        unsorted.add(1);
        unsorted.add(2);
        unsorted.add(3);

        System.out.println(meanderingArray(unsorted));
    }

    public static List<Integer> meanderingArray(List<Integer> unsorted){
        int[] arr = unsorted.stream().mapToInt(i->i).toArray();
        rearrange(arr, arr.length);
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
