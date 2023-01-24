/* Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.

Problem Constraints
1 <= |A| <= 2000


Input Format
First and only argument is vector A

Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array


Example Input
Input 1:
A = [1, 3]
Input 2:
A = [2]


Example Output
Output 1:
 2
Output 2:
 1


Example Explanation
Explanation 1:
 Only choice is to take both elements.
Explanation 2:
 Take the whole array. */

package array;

public class ClosestMinMax {
    public int solve(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        if (min == max) {
            return 1;
        }

        int lowest_min = -1;
        int lowest_max = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] == min) {
                lowest_min = i;
                if (lowest_max != -1) {
                    ans = Math.min(ans, lowest_min - lowest_max + 1);
                }
            } else if (A[i] == max) {
                lowest_max = i;
                if (lowest_min != -1) {
                    ans = Math.min(ans, lowest_max - lowest_min + 1);
                }
            }
        }

        return ans;
    }
}
