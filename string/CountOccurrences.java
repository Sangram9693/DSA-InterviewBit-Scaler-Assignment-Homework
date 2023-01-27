/* Problem Description
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.

Problem Constraints
1 <= |A| <= 1000


Input Format
The first and only argument contains the string A, consisting of lowercase English alphabets.

Output Format
Return an integer containing the answer.


Example Input
Input 1:
  "abobc"
Input 2:
  "bobob"


Example Output
Output 1:
  1
Output 2:
  2


Example Explanation
Explanation 1:
  The only occurrence is at second position.
Explanation 2:
  Bob occures at first and third position. */

package string;

public class CountOccurrences {
    public int solve(String A) {
        char c[] = A.toCharArray();
        int N = c.length;

        if (N < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i < N; i++) {
            if (c[i - 2] == 'b' && c[i - 1] == 'o' && c[i] == 'b') {
                count++;
            }
        }

        return count;

    }
}
