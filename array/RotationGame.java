/* Problem Description
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.

Problem Constraints
1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109

Input Format
There are 2 lines in the input
Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.
Line 2: A single integer B.

Output Format
Print array A after rotating it B times towards the right.

Example Input
Input 1 :
4 1 2 3 4
2
Example Output
Output 1 :
3 4 1 2

Example Explanation
Example 1 :
N = 4, A = [1, 2, 3, 4] and B = 2.
Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
Final array = [3, 4, 1, 2] */

package array;

import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();

        if (K > N) {
            K = K % N;
        }

        reverse(arr, 0, N - 1);
        reverse(arr, 0, K - 1);
        reverse(arr, K, N - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
