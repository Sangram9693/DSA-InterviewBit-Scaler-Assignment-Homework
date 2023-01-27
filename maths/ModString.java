/* Problem Description
You are given a large number in the form of a string A where each character denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.

Problem Constraints
1 <= A.length() <= 105
0 <= Ai <= 9
1 <= B <= 109


Input Format
The first argument is a string A.
The second argument is an integer B.

Output Format
Return a single integer denoting the value of A % B.


Example Input
Input 1:
A = "143"
B = 2
Input 2:
A = "43535321"
B = 47


Example Output
Output 1:
1
Output 2:
20


Example Explanation
Explanation 1:
143 is an odd number so 143 % 2 = 1.
Explanation 2:
43535321 % 47 = 20 */

package maths;

public class ModString {
    public int findMod(String A, int B) {
        String[] arr = A.split("");
        long result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = (result * 10 + Integer.parseInt(arr[i])) % B;
        }

        return (int) result % B;
    }
}
