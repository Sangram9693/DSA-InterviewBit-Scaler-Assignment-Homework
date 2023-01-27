/* Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)
Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).

Problem Constraints
1 <= N <= 6000

Input Format
First and only argument is a string A.

Output Format
Return a string denoting the longest palindromic substring of string A.

Example Input
A = "aaaabaaa"

Example Output
"aaabaaa"


Example Explanation
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa". */

package string;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        char c[] = A.toCharArray();
        int N = c.length;

        int ans = Integer.MIN_VALUE;
        int p1 = 0;
        int p2 = 0;
        // odd
        for (int i = 0; i < N; i++) {
            int[] a = expand(c, i, i);
            int val = a[1] - a[0] - 1;

            if (val > ans) {
                ans = val;
                p1 = a[0] + 1;
                p2 = a[1] - 1;
            }
        }
        // even
        for (int i = 0; i < N - 1; i++) {
            int[] a = expand(c, i, i + 1);
            int val = a[1] - a[0] - 1;

            if (val > ans) {
                ans = val;
                p1 = a[0] + 1;
                p2 = a[1] - 1;
            }
        }

        String out = "";
        for (int i = p1; i <= p2; i++) {
            out += c[i];
        }

        return out;

    }

    private int[] expand(char c[], int p1, int p2) {
        int a[] = new int[2];
        while (p1 >= 0 && p2 < c.length && c[p1] == c[p2]) {
            p1--;
            p2++;
        }

        a[0] = p1;
        a[1] = p2;

        return a;
    }
}
