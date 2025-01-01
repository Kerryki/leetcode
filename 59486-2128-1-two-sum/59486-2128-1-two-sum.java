import java.util.Map;
import java.util.HashMap;
class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>num= new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int subs=target-nums[i];
            if (!num.containsKey(subs)){
                num.put(nums[i],i);
            }else
            return new int[] { num.get(subs),i};
            
        }
    //     for(int i=0; i<nums.length;i++){
    //         for(int j =i+1; j<nums.length; j++){
    //             if(nums[i]+nums[j]==target){
    //                 return new int[] {i, j};
    //             }
    //         }
    //     }
         return new int[] {};
     }
}