class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int sum;
       for(int i = 0; i<nums.length-1; i++){
           for(int j = i+1; j<nums.length;j++){
               sum = nums[i]+nums[j];
               if(sum == target){
                   return new int[]{i,j};
               }

           }
       }
       return null;
    }
        }
//         // In case there is no solution, we'll just return null
//         return null;
//     }
// }
