class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indecates = {0,0};
        boolean stop = false;
        if(nums.length == 2){
            indecates[0]=0;
            indecates[1]=1;
        }
        else{
            for (int i=0; i<nums.length; i++){
                for (int j=i+1; j<nums.length; j++){
                    if(nums[i]+nums[j]==target){
                        indecates[0]=i;
                        indecates[1]=j;
                        stop = true;
                        break;
                    }
                }
                if(stop)
                    break;
            }
        }
        return indecates;
    }
}