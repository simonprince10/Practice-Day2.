package com.company;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3,4,3};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }

    }
}
