/* Problem Description
Reverse the bits of an 32 bit unsigned integer A.

Problem Constraints
0 <= A <= 232

Input Format
First and only argument of input contains an integer A.

Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.



Example Input
Input 1:
 0
Input 2:
 3


Example Output
Output 1:
 0
Output 2:
 3221225472


Example Explanation
Explanation 1:
        00000000000000000000000000000000    
=>      00000000000000000000000000000000
Explanation 2:
        00000000000000000000000000000011    
=>      11000000000000000000000000000000
 
*/

package bit_manipulations;

public class ReverseBits {
    public long reverse(long A) {
        long ans = 0;
        if (A == 0) {
            return ans;
        }

        String str = "";
        while (A > 0) {
            str += (A % 2);
            A = A / 2;
        }

        for (int i = 0; i < str.length(); i++) {
            String e = str.charAt(i) + "";
            ans += (Long.parseLong(e) * Math.pow(2, 31 - i));
        }

        return ans;
    }
}
