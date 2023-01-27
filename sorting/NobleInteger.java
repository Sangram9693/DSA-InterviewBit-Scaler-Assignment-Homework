/* Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.

Problem Constraints
1 <= |A| <= 2*105
-108 <= A[i] <= 108


Input Format
First and only argument is an integer array A.

Output Format
Return 1 if any such integer p is present else, return -1.

Example Input
Input 1:
 A = [3, 2, 1, 3]
Input 2:
 A = [1, 1, 3, 3]

Example Output
Output 1:
 1
Output 2:
 -1


Example Explanation
Explanation 1:
 For integer 2, there are 2 greater elements in the array..
Explanation 2:
 There exist no integer satisfying the required conditions. */

package sorting;

import java.util.Arrays;
import java.util.Collections;

public class NobleInteger {
    public int solve(int[] A) {
        int N = A.length;
        Integer a[] = new Integer[N];

        for (int i = 0; i < N; i++) {
            a[i] = A[i];
        }

        Arrays.sort(a, Collections.reverseOrder());

        int count = 0;
        int ans = 0;

        if (a[0] == 0) {
            return 1;
        } else {
            for (int i = 1; i < N; i++) {
                if (a[i - 1] != a[i]) {
                    count = i;
                }

                if (a[i] == count) {
                    ans++;
                }
            }
        }

        if (ans == 0)
            return -1;
        return 1;
    }
}
