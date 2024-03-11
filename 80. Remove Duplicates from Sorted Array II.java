class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int count=1;
        int prev=-1;
        for(int i=0;i<nums.length;i++){
            if(prev==nums[i] && count<2){
                nums[j++]=nums[i];
                count=2;
            }
            if(prev!=nums[i]){
                nums[j++]=nums[i];
                count=1;
            }

            prev=nums[i];
        }
        return j;
    }
}
