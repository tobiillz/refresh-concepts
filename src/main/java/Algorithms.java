import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Algorithms {

// <ALGORITHM 1 - TWO SUM>

//    sum of two integers in the array should be equal to the target value

    int[] nums = {1,2,3,4,5,6};
    int target = 9;

//    1. --------Brute Force Method------------

        public int[] twoSum(int[] nums,int target ){

            for(int i = 0; i < nums.length; i++){
                for (int j = i +1; j< nums.length; j++){
                    if (nums[i] + nums[j] == target){
                    };
                }
            }
            return null;
        }

//        --------------Hash Map----------------------


/*        public int[] twoSum(int[] nums,int target ){
            HashMap<Integer,Integer> map = new HashMap<>();
        }*/

    public static void main(String[] args) {
        System.out.println("Tested");
    }



}






