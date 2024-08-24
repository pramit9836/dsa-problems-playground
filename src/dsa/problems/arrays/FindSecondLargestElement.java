package dsa.problems.arrays;

/**
 * @author pramitk
 * @project dsa-problems-playground
 * @date 24/08/24
 */

/**
 * Problem: find second-highest number in an array
 */
public class FindSecondLargestElement {

    public static void main(String[] args) {

        int [] arrayOfInteger = {-1,-9,-1,-1,-3,-5,-7,-1};
        int highestNumber = Integer.MIN_VALUE;
        int secHighestNumber = Integer.MIN_VALUE;
        for(int i = 1; i < arrayOfInteger.length; i++) {
            if(highestNumber < arrayOfInteger[i]) {
                secHighestNumber = highestNumber;
                highestNumber = arrayOfInteger[i];
            }else if(secHighestNumber < arrayOfInteger[i] && arrayOfInteger[i] != highestNumber) {
                secHighestNumber = arrayOfInteger[i];
            }
        }
        System.out.println("second Highest Number in Array   :  "+secHighestNumber);
    }


}
