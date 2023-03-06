
public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        int testNum = 0;
        for (int i = 0; i < arr.length - 1; i++){
            testNum = arr[i];
            for (int j = 0; j < arr.length; j++){
                if ((i != j) && (testNum + arr[j]) == target)
                    return true;
            }
        }
        return false;
    }
}
