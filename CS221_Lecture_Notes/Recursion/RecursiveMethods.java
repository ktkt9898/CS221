/**
 * @author Kyle Truschel
 */

 public class RecursiveMethods {
    // mult
    private int baskets;
    private int applesPerBasket;

    // pow
    private int base;
    private int exponent;

    // min/max array
    int[] array = {2, 5, 3, 1};
    int[] array2 = {4, 3, 1, 5};
    int startingIndex;

    // contains
    int targetValue;

    // string
    String stringToSearch;

    // public static int mult(int baskets, int applesPerBasket) {
    //     if (baskets == 1) { // the base case, and exit for method
    //         return applesPerBasket;
    //     }
    //     // Recursive case: count 1 basket and reduce the incoming baskets by 1 and count them
    //     return applesPerBasket + mult(baskets - 1, applesPerBasket);
    // }

    // public static int pow(int base, int exponent) {
    //     // Check for base case first
    //     if (exponent == 1) {
    //         return base;
    //     }
    //     // Recursively multiply base by power of base - 1; decrement exponent
    //     return base * pow(base, exponent - 1);
    // }

    // // Private so the user cannot start at an incorrect starting index
    // private static int minFromArray(int[] array, int startingIndex) {
    //     // By declaring a returnValue, we can ensure best practice with only one return statement
    //     int returnValue;
    //     // base case, the last index of the array. Using Index starts at 0
    //     if (startingIndex == array.length - 1) {
    //         returnValue =  array[startingIndex];
    //     }
    //     // recursive case, the minimum from the rest of the array
    //     // Advance the starting index
    //     returnValue =  Math.min(array[startingIndex], minFromArray(array, startingIndex + 1));

    //     return returnValue;
    // }

    // public static int minFromArray(int[] array) {
    //     return minFromArray(array, 0);
    // }

    // private static int contains(int[] array, int targetValue, int startingIndex) {
    //     // Remove one value from the array and check to see if it equals the target value,
    //     // if not, keep recursively searching exactly one value
    //     // base case no elements, no, the array does not contain the target value
    //     if (startingIndex == array.length) {
    //         return false;
    //     }
    //     // Otherwise, keep recursively searching by advancing in the starting index OR if its only one element list
    //     // To short circuit, ensure the == target check is first
    //     return ((array[startingIndex] == targetValue) || (contains(array, targetValue, startingIndex + 1)));
    // }

    // public static int stringSearchLength (String stringToSearch) {
    //     // base case
    //     // If a string is completely empty
    //     // Also use .equals since we are comparing objects not primitive types
    //     if (stringToSearch.equals("")) {
    //         return 0;
    //     }
    //     // recursive case
    //     // Advance 1 in the substring until "" remains, which we add up the call stack values
    //     // O(n^2) with this method, since the order is dependent on how long the string is and calling the substring method
    //     return 1 + stringSearchLength(stringToSearch.substring(1));

    //     // Search thru indexing is O(n)
    // }

    // public static void printChars(String str) {
    //     // base case is empty string
    //     if (str.equals("")) {
    //         return;
    //     }
    //     // Recursive search, advances
    //     System.out.println(str.charAt(0));
    //     printChars(str.substring(1));
    // }

    public static String reverseChars(String str) {
        // Base case is empty or a single element
        if (str.length() < 2) {
            return str;
        }

        // pull out the string and concatenate
        return str.charAt(str.length() - 1) + reverseChars(str.substring(0, str.length() - 1));

        // // Alternatively
        // return reverseChars(str.substring(1) + str.charAt(0));
    }

    public static void main(String[] args) {
        // System.out.println(mult(4, 5));
        // System.out.println(pow(2, 4));
        // System.out.println(stringSearchLength("hello"));
        System.out.println(reverseChars("hello"));
    }
 }