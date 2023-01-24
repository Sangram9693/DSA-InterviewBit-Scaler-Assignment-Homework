/* Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Problem Constraints
1 <= n <= 105
-105 <= A[i] <= 105

Input Format
First argument contains an array A of integers of size N

Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Example Input
Input 1:
A=[2, 1, 6, 4]
Input 2:
A=[1, 1, 1]


Example Output
Output 1:
1
Output 2:
3

Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
Therefore, the required output is 1. 
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Therefore, the required output is 3. */

package array;

public class SpecialIndex {
    public int solve(int[] A) {
        int N = A.length;

        int[] pfOdd = prepareOddPrefix(A, N);
        int[] pfEven = prepareEvenPrefix(A, N);

        int count = 0;

        for (int i = 0; i < N; i++) {
            int sumOfEven = 0;
            int sumOfOdd = 0;

            if (i == 0) {
                sumOfEven = pfOdd[N - 1];
            } else {
                sumOfEven = pfEven[i - 1] + (pfOdd[N - 1] - pfOdd[i]);
            }

            if (i == 0) {
                sumOfOdd = pfEven[N - 1];
            } else {
                sumOfOdd = pfOdd[i - 1] + (pfEven[N - 1] - pfEven[i]);
            }

            if (sumOfEven == sumOfOdd) {
                count++;
            }
        }

        return count;
    }

    public int[] prepareEvenPrefix(int A[], int N) {
        int[] pf = new int[N];
        pf[0] = A[0];
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                pf[i] = pf[i - 1] + A[i];
            } else {
                pf[i] = pf[i - 1];
            }
        }

        return pf;
    }

    public int[] prepareOddPrefix(int A[], int N) {
        int[] pf = new int[N];
        pf[0] = 0;
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0) {
                pf[i] = pf[i - 1] + A[i];
            } else {
                pf[i] = pf[i - 1];
            }
        }

        return pf;
    }
}
