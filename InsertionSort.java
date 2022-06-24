class InsertionSort {
    public int[] sortArray(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            for(int j = i; j > 0; j--) {
                if(nums[j] < nums[j - 1]) {
                    swap(j, j-1, nums);
                }
            }
        }
        return nums;
    }
    
    private void swap(int i,int j,int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
