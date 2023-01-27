/* Problem Description
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:
Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.



Problem Constraints
1<=N<=100000


Input Format
First argument is a string A of size N.

Output Format
Return the resultant string.



Example Input
A="AbcaZeoB"

Example Output
"bc###bc###"



Example Explanation
First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#'.
A becomes "bc###bc###". */

package string;

public class StringOperations {
    public String solve(String A) {
        int N = A.length();
        char c[] = A.toCharArray();

        String out = "";
        for (int i = 0; i < N; i++) {
            if (!(c[i] >= 65 && c[i] <= 90)) {
                if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                    out += '#';
                } else {
                    out += c[i];
                }
            }
        }

        return out + out;
    }
}
