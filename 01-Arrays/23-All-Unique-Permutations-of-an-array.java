class Solution {
    static void backtrack(ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> tempList, ArrayList<Integer> arr, boolean[] used, int n) {
        
        if(tempList.size() == n) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        
        for(int i = 0;i < n;i++){
            if (used[i] || (i > 0 && arr.get(i) == arr.get(i - 1) && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            tempList.add(arr.get(i));
            backtrack(resultList, tempList, arr, used, n);
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        boolean[] used = new boolean[n];
        Collections.sort(arr);
        backtrack(resultList, new ArrayList<>(), arr, used, n);
        return resultList;
        
    }
}

