/* Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.

Input Format
The only argument given is string A.
Output Format
Return the length of the longest consecutive 1’s that can be achieved.

Constraints
1 <= length of string <= 1000000
A contains only characters 0 and 1.

For Example
Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7 */

package array;

public class LengthLongestConsecutiveOnes {
    public int solve(String str) {
        char A[] = str.toCharArray();
        int N = A.length;
        int oneCount = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == '1') {
                oneCount++;
            }
        }

        if (oneCount == 0) {
            return 0;
        } else if (oneCount == N) {
            return N;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == '0') {
                int ls = 0, rs = 0;
                int j = i - 1;

                while (j >= 0 && A[j] == '1') {
                    ls++;
                    j--;
                }

                int k = i + 1;
                while (k < N && A[k] == '1') {
                    rs++;
                    k++;
                }

                if (oneCount == (ls + rs)) {
                    ans = Math.max(ans, ls + rs);
                } else {
                    ans = Math.max(ans, ls + rs + 1);
                }
            }
        }

        return ans;
    }
}
