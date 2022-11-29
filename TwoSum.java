class Solution {
    public int[] twoSum(int[] arr, int x) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i <n ; i++) {
            int diff= 0;
            if(arr[i] < 0){
                diff = x+ Math.abs(arr[i]);
            }
            else {
                diff = x- arr[i];
            }
            if(map.containsKey(arr[i])) {
                return new int[]{map.get(arr[i]), i};
            }
            map.put(diff, i);
            
        }
        return new int[]{0, 0};
    }
}
