/* Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.

Problem Constraints
1 <= N <= 3 * 105

Input Format
The only argument given is string A.

Output Format
Return the string A after reversing the string word by word.

Example Input
Input 1:
    A = "the sky is blue"
Input 2:
    A = "this is ib"


Example Output
Output 1:
    "blue is sky the"
Output 2:
    "ib is this"    


Example Explanation
Explanation 1:
    We reverse the string word by word so the string becomes "blue is sky the".
Explanation 2:
    We reverse the string word by word so the string becomes "ib is this". */

package string;

public class ReverseString {
    public String solve(String A) {
        String str[] = A.trim().split(" ");
        String fStr = "";
        for (String s : str) {
            if (!s.equals(" ")) {
                fStr = fStr + s + " ";
            }
        }

        fStr = fStr.trim();
        char c[] = fStr.toCharArray();
        int N = c.length;

        reverse(c, 0, N - 1);

        int l = 0, r = 0;

        while (r < N) {
            while (r < N && c[r] != ' ') {
                r++;
            }
            reverse(c, l, r - 1);
            r++;
            l = r;
        }

        return String.valueOf(c);
    }

    public void reverse(char c[], int start, int end) {
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }
}
