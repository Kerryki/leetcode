class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> map= new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }else{
        //         map.put(nums[i],1);
        //     }
        // } 
        
        
        
        // int maxCount = 0;
        // int majorityElement = -1;

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() > maxCount) {
        // maxCount = entry.getValue();
        // majorityElement = entry.getKey();
        // }
        // }
        // return majorityElement;
                        





        int candidate=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                candidate=nums[i];
                count++;
            }else if(nums[i]==candidate){
                count++;
            }else if(nums[i]!=candidate){
                count--;
            }

        }
        return candidate;
    }
}