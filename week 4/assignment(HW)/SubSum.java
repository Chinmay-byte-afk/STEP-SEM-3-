import java.util.HashMap;
import java.util.Map;

public class SubSum {

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prefixCount = new HashMap<>();

        prefixCount.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            count += prefixCount.getOrDefault(
                prefixSum - k, 0
            );

            prefixCount.put(
                prefixSum,
                prefixCount.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 1};
        System.out.println(subarraySum(nums1, 2));

        int[] nums2 = {1, 2, 3};
        System.out.println(subarraySum(nums2, 3));
    }
}