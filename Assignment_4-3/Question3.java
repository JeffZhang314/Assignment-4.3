import java.util.ArrayList;

class Question3 {

    public static void removeConsecutives(ArrayList<Integer> nums) {
        //This method removes consecutive duplicate values from the 
        //list nums.  Hint: loop backwards through the list
        int numsIPlus = nums.get(nums.size() - 1);
        for (int i = nums.size() - 2; i >= 0; i --) {
            int numsI = nums.get(i);
            if (numsI == numsIPlus) {
                nums.remove(i);
            } else {
                numsIPlus = numsI;
            }
        }
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(1);
        System.out.println("Our list before: " + nums);
        removeConsecutives(nums); 
        System.out.println("Our list after:  " + nums);
        //should output [1,2,3,1]
    }

    
}