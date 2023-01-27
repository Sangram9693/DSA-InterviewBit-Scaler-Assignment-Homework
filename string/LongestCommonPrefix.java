/* Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Problem Constraints
0 <= sum of length of all strings <= 1000000

Input Format
The only argument given is an array of strings A.

Output Format
Return the longest common prefix of all strings in A.

Example Input
Input 1:
A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:
A = ["abab", "ab", "abcd"];


Example Output
Output 1:
"a"
Output 2:
"ab"


Example Explanation
Explanation 1:
Longest common prefix of all the strings is "a".
Explanation 2:
Longest common prefix of all the strings is "ab". */

package string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] A) {
        int N = A.length;
        if (N == 0) {
            return "";
        }
        int fN = A[0].length();
        String f = A[0];
        for (int i = 0; i < fN; i++) {
            char c = f.charAt(i);
            for (int j = 1; j < N; j++) {
                if (A[j].length() == i || A[j].charAt(i) != c) {
                    return f.substring(0, i);
                }
            }
        }

        return f;
    }
}
