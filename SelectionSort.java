class SelectionSort {
    public int[] sortArray(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int mi = i;
            int mv = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < mv) {
                    mv = nums[j];
                    mi = j;
                }
            }
            swap(i, mi, nums);
            i++;
        }
        return nums;
    }
    
    private void swap(int i,int j,int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
