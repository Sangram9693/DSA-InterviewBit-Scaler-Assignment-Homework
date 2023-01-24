/* Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.


Problem Constraints
1 <= A <= 109


Input Format
First and only argument contains integer A


Output Format
Return an integer as the answer


Example Input
Input 1:
11
Input 2:
6


Example Output
Output 1:
3
Output 2:
2


Example Explanation
Explaination 1:
11 is represented as 1011 in binary.
Explaination 2:
6 is represented as 110 in binary. */

package bit_manipulations;

public class NumberOfOneBits {
    public int numSetBits(int A) {
        String str = "";

        while (A > 0) {
            int r = A % 2;
            A = A / 2;
            str += r;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
