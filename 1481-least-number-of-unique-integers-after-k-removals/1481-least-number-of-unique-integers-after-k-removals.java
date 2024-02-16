class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // HashSet set = new HashSet<Integer>();
        // for(int i = 0 ; i < arr.length ; i++){
        //     set.add(arr[i]);
        // }
        // int total = set.size();
        // int ans = Math.abs(k - total);
        // // for(int num : set){
        // //     if(set.hashNext){
        // //         next;
        // //         count++
        // //     }
        // // }
        // return ans;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());

        elements.sort((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : elements) {
            if (entry.getValue() <= k) {
                k -= entry.getValue();
                map.remove(entry.getKey());
            } else {
                break;
            }
        }
        return map.size();
    }
}

