// GeneratePermutation

import java.util.ArrayList;

public class Lecture11 {

    public static void helper(int[] arr, ArrayList<Integer> ans) {
        if (ans.size() == arr.length) {
            // print this arraylist
            printArrayList(ans);
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            if (ans.contains(arr[i])) {
                continue;
            }
            ans.add(arr[i]);
            helper(arr, ans);
            // backtrack
            ans.remove(ans.size() - 1);
        }
    }

    private static void printArrayList(ArrayList<Integer> ans) {
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr, ans);
    }
}
