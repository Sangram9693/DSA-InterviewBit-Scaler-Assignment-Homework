/* Problem Description
You are given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.
Find the minimum number of distinct characters in the resulting string.

Problem Constraints
1 <= N <= 100000
0 <= B < N



Input Format
The first argument is a string A.
The second argument is an integer B.

Output Format
Return an integer denoting the minimum number of distinct characters in the string.

Example Input
A = "abcabbccd"
B = 3

Example Output
2

Example Explanation
We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
So the minimum number of distinct character will be 2. */

package string;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeCharacter {
    public int solve(String A, int B) {
        int freq[] = new int[26];
        char c[] = A.toCharArray();
        int N = c.length;
        for (int i = 0; i < N; i++) {
            freq[c[i] - 'a']++;
        }

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                al.add(freq[i]);
            }
        }

        Collections.sort(al);

        for (int i = 0; i < al.size(); i++) {
            B = B - al.get(i);
            if (B < 0) {
                return al.size() - i;
            }
        }

        return 1;
    }
}
