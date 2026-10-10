import java.util.Arrays;

public class Merge {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        System.out.println(
            Arrays.toString(mergeSortedArrays(arr1, arr2))
        );

        int[] arr3 = {};
        int[] arr4 = {1, 2, 3};

        System.out.println(
            Arrays.toString(mergeSortedArrays(arr3, arr4))
        );
    }
}   