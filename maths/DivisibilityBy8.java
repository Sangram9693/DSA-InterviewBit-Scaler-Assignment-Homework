/* Problem Description
You are given a number A in the form of a string. Check if the number is divisible by eight or not.

Return 1 if it is divisible by eight else, return 0.


Problem Constraints
1 <= length of the String <= 100000
'0' <= A[i] <= '9'


Input Format
The only argument given is a string A.

Output Format
Return 1 if it is divisible by eight else return 0.


Example Input
Input 1:
A = "16"
Input 2:
A = "123"


Example Output
Output 1:
1
Output 2:
0


Example Explanation
Explanation 1:
 16 = 8 * 2
Explanation 2:
123 = 15 * 8 + 3 */

package maths;

public class DivisibilityBy8 {
    public int solve(String A) {
        String arr[] = A.split("");

        if (arr.length <= 3) {
            int num = Integer.parseInt(A);
            if (num % 8 == 0) {
                return 1;
            }
        } else {
            String last3digits = "";
            for (int i = arr.length - 3; i <= arr.length - 1; i++) {
                last3digits += arr[i];
            }

            int num = Integer.parseInt(last3digits);
            if (num % 8 == 0) {
                return 1;
            }
        }

        return 0;
    }
}
