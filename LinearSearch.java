//Linear search
//arrayitems -> 5,7,9,12,17,26;
// 1) If the target is '12'
// 2) Will compare with first element '5' if this matches target then okay and execution completed,Else will move to other element '7' and so on.
// 3) The no of steps depends upon the length of an array.
// 4) What if there is no target value in the array, then there is no point of executing all the steps.
// 5) Time complexity of linear search is O(n)->(Linear time).
// 6) As length of 'n' increases, steps increases and also time increases.
// 7) 
//pseudo code
// procedure LinearSearch(Arr: List of items, target: item to search for)
// n=length(Arr) -> which is '6' as per arrayitems above
// for i from 0 to n-1
// if Arr[i] equals target then
// return i -> return the index where the target element is found
// end if
// end  for
// return -1 -> return -1 if target element is not found in the list & procedure
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 5, 7, 9, 12, 17, 26 };
        int target = 17;
        int result = linearSearchMethod(array, target);
        if (result != -1) {
            System.out.println("Element found in index position -> " + result);
        } else {
            System.out.println("Element not found!");
        }
    }

    public static int linearSearchMethod(int[] array, int target) {
        for (int i=0;i<array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}