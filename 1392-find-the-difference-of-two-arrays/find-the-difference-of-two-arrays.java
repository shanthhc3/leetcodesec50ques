import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements to sets to keep only distinct values
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        // Find distinct elements in nums1 not present in nums2
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }
        
        // Find distinct elements in nums2 not present in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }
        
        return Arrays.asList(list1, list2);
    }
}