//Binary search
//arrayitems -> 5,7,8,9,12,17,26;
// 1) If target value is '8' Divide array into two parts
// midvalue = left(first index)+right(last index)/2 -> 0+6/2 -> 3 
// 2) If mid is equal to target '8' then return mid value
// 3) If mid number is less than mid value '8' or greater than 8 skip the other part of array 5,7,8,9 are considered and 9,12,17,26 are skipped/ignored
// 4) Now the mid value =  0+3/2 -> 1.5 (On float it will be index 1)
// Since '8' is not matching with '7' again divide the array into two parts
// 5) Will follow same steps till midvalue matches target value
// 6) No of operations in binary search is less, If there are more values than it is better than linear search
// 7) If the value you search is the first value then linear search is the best. Because it is better to check with one step
// 8) Time complexity of Binary search  -> O(log n) -> (Logarthimetic time)
// 9) As length 'n' increases, no of steps will not increase in same sequence as linear search
//pseudo code
// procedure BinarySearch(Arr: List of sorted items, target: item to search for)
// left = 0
// right = length(Arr)-1
// while left<=right
// mid=(left+right)/2
// if Arr[mid] equals target then
// return mid
// else if Arr[mid]<target then
// left = mid+1 -> continue searching in the right half
// else
// right = mid-1 -> continue searching in the left half
// end if
// end while
// return -1 -> if target not found
// end procedure
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 5, 7, 8, 9, 12, 17, 26 };
        int target = 17;
        int result = binarySearchMethod(array, target);
        if (result != -1) {
            System.out.println("Element found in index position -> " + result);
        } else {
            System.out.println("Element not found!");
        }
    }

    public static int binarySearchMethod(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
