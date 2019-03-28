public  int maxMirror(int[] nums) {
  int total = 0;
  for(int i =0;i<nums.length;i++){
    int l = i;int j =nums.length-1;int count = 0;
    while(j>=0&&l<nums.length){
      if(nums[j]==nums[l]){
        count++;j--;l++;
        if(count>total){
          total = count;}
      }
      else if(nums[l] != nums[j]){
        count = 0;j--;
      }
    }}
    return total;
   } 
