/* Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

Problem Constraints
1 <= A <= 5000

Input Format
The only argument given is integer A.

Output Format
Return the Ath magic number.

Example Input
Example Input 1:
 A = 3
Example Input 2:
 A = 10


Example Output
Example Output 1:
 30
Example Output 2:
 650


Example Explanation
Explanation 1:
 Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 3rd element in this is 30

Explanation 2:
 In the sequence shown in explanation 1, 10th element will be 650. */

package maths;

public class FindNthMagicNumber {
    public int solve(int A) {
        int out[] = new int[A];

        for (int i = 0; i < A; i += 3) {
            out[i] = (int) Math.pow(5, i + 1);
            out[i + 1] = (int) Math.pow(5, i + 2);
            out[i + 2] = out[i] + out[i + 1];
        }

        System.out.println(out[A - 1]);

        return out[A - 1];
    }
}
