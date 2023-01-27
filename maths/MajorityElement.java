/* Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.


Problem Constraints
1 <= N <= 5*105
1 <= num[i] <= 109


Input Format
Only argument is an integer array.

Output Format
Return an integer.

Example Input
[2, 1, 2]


Example Output
2

Example Explanation
2 occurs 2 times which is greater than 3/2. */

package maths;

public class MajorityElement {
    public int majorityElement(final int[] A) {
        int N = A.length;

        int me = A[0];
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (A[i] == me) {
                count++;
            } else if (count == 0) {
                me = A[i];
                count = 1;
            } else {
                count--;
            }
        }

        return me;

    }
}
