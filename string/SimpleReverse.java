/* Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.

Output Format
Return a string denoting the reversed string.

Example Input
Input 1:
 A = "scaler"
Input 2:
 A = "academy"

Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation
Explanation 1:
 Reverse the given string. */

package string;

public class SimpleReverse {
    public String solve(String A) {
        char c[] = A.toCharArray();
        int start = 0;
        int end = A.length() - 1;

        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(c);
    }
}
