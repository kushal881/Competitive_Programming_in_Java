package Hashmap;

import java.util.HashMap;

public class LargestSubArray {
    public int ZeroSumArray(int nums[]){
        int n = nums.length;
        int prefixSum = nums[0];
        int currMax = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            prefixSum+=nums[i+1];
            if(mp.containsKey(prefixSum)){
               currMax = Math.max(currMax,i-mp.get(prefixSum));
            }else{
                mp.put(prefixSum,i);
            }

        }
        return currMax;
    }
    public static void main(String[] args) {

    }
}
