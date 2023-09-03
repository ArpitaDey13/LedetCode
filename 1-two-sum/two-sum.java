class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();

        //fill hasmap
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        //search
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int rem=target-num;
            if(map.containsKey(rem)){
                int index=map.get(rem);
                if(i!=index){
                    return new int[]{i,index};
                }
            }
        }
        return new int[]{};

    }
}