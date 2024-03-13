class Solution {
    public void rotate(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
        int index=0;
        for(int i=nums.length-(k%nums.length);i<nums.length;i++){
            nums1[index++]=nums[i];
        }
        for(int i=0;i<nums.length-(k%nums.length);i++){
            nums1[index++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums1[i];
        }
    }
}
