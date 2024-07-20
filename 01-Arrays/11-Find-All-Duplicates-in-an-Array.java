//Method - 1 :

//Time Complexity : O(N) + O(N)
//Space Complexity : O(N+1)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[nums.length+1];
        for(int i = 0;i < nums.length;i++) {
            arr[nums[i]]++;
        }
        for(int i = 1;i <= nums.length;i++) {
            if(arr[i] > 1){
                list.add(i);
            }
        }
        return list;
    }
}

//Method - 1 :

//Time Complexity : O(N)
//Space Complexity : O(1)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length;i++) {
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0) {
                list.add(index + 1);
            }
            nums[index] = -1 * nums[index];
        }
        return list;
    }
}

