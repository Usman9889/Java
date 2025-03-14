public class TwoSum {
      public static void twoSum(int nums[], int target){
            for(int i=0; i<nums.length; i++){
                  int first = nums[i];
                  for(int j=i+1; j<nums.length; j++){
                        int sec = nums[j];
                        if(first + sec == target){
                              System.out.print(i+","+j);
                        }
                  }
            }
      }
      public static void main(String[] args){
            int nums[] = {2,7,11,15};
            int target = 18;
            twoSum(nums, target);
      }
}
