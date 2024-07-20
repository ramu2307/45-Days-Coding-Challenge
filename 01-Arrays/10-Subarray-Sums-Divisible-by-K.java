//Method -1 :

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int cnt = 0;
        for(int i = 0;i < nums.length;i++) {
            sum += nums[i];
            int mod = sum % k;
            if(mod < 0) {
                mod = mod + k;
            }
            if(map.containsKey(mod)) {
                cnt += map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod,0) + 1);
        }
        return cnt;
    }
}

//Method - 2 :

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int mod[] = new int[k];
        mod[0] = 1;
        int sum = 0;
        int cnt = 0;
        for(int i = 0;i < nums.length;i++) {
            sum += nums[i];
            int res = sum % k;
            if(res < 0) {
                res = res + k;
            }
            if(mod[res] > 0) {
                cnt += mod[res];
            }
            mod[res]++;
        }
        return cnt;
    }
}

