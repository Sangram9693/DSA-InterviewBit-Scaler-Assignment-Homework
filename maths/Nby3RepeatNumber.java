/* Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.


Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109


Input Format
The only argument is an integer array A.


Output Format
Return an integer.


Example Input
[1 2 3 1 1]


Example Output
1


Example Explanation
1 occurs 3 times which is more than 5/3 times. */

package maths;

public class Nby3RepeatNumber {
    public int repeatedNumber(int[] A) {

        int N = A.length;

        if (N == 1) {
            return A[0];
        }

        int count1 = 0;
        int count2 = 0;
        int me1 = Integer.MAX_VALUE;
        int me2 = Integer.MAX_VALUE;

        for (int i = 1; i < N; i++) {
            if (A[i] == me1) {
                count1++;
            } else if (A[i] == me2) {
                count2++;
            } else if (count1 == 0) {
                me1 = A[i];
                count1++;
            } else if (count2 == 0) {
                me2 = A[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int freq1 = 0;
        int freq2 = 0;
        for (int i = 0; i < N; i++) {
            if (me1 == A[i]) {
                freq1++;
            } else if (me2 == A[i]) {
                freq2++;
            }
        }

        if (freq1 > N / 3) {
            return me1;
        }

        if (freq2 > N / 3) {
            return me2;
        }

        return -1;

    }
}
