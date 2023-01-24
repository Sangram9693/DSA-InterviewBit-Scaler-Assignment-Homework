/* Problem Description
You are given an integer array A of size N.
You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.
Find and return this maximum possible sum.
NOTE: Suppose B = 4, and array A contains 10 elements, then
You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.


Problem Constraints
1 <= N <= 105
1 <= B <= N
-103 <= A[i] <= 103


Input Format
First argument is an integer array A.
Second argument is an integer B.

Output Format
Return an integer denoting the maximum possible sum of elements you picked.



Example Input
Input 1:
 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:
 A = [1, 2]
 B = 1

Example Output
Output 1:
 8
Output 2:
 2


Example Explanation
Explanation 1:

 Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
Explanation 2:
 Pick element 2 from end as this is the maximum we can get */

package array;

public class PickBothSides {
    public int solve(int[] A, int B) {
        int N = A.length;
        int currSum = 0;
        for (int i = 0; i < B; i++) {
            currSum += A[i];
        }

        int left = B - 1, right = N - 1;
        int max = currSum;
        while (left >= 0 && right >= 0) {
            currSum = currSum - A[left--];
            currSum = currSum + A[right--];
            max = Math.max(max, currSum);
        }

        return max;
    }
}
