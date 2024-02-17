package assignment3.sorting;

import java.util.Scanner;


public class FindOccurrences {
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find occurence of in the array?");
        int target = sc.nextInt();
//        int res=findNumberOfOccurrences(arr,target);
        int firstOccurence = findFirstOccurrence(arr, 0, arr.length - 1, target);
        int lastOccurence = findLastOccurrence(arr, 0, arr.length - 1, target);


        if (firstOccurence == lastOccurence && firstOccurence == -1) {
            System.out.println("Element not found in an array");
        } else {
            int frequency = lastOccurence - firstOccurence + 1;
            System.out.println("The count of the given target element is: " + frequency);
        }}

    private static int findFirstOccurrence(int[] arr, int low, int high, int target) {
        int result = -1;
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        return result;
    }

    private static int findLastOccurrence(int[] arr, int low, int high, int target) {
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    }
