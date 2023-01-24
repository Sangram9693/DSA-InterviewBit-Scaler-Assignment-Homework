/* Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.

Problem Constraints
1 <= A <= 1000

Input Format
First and only argument is integer A

Output Format
Return a 2-D matrix which consists of the elements added in spiral order.

Example Input
Input 1:
1
Input 2:
2
Input 3:
5

Example Output
Output 1:

[ [1] ]
Output 2:

[ [1, 2], [4, 3] ]
Output 2:

[ [1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9] ]


Example Explanation
Explanation 1:

Only 1 is to be arranged.
Explanation 2:

1 --> 2
      |
      |
4<--- 3 */

package array;

public class SpiralOrderMatrixII {
    public int[][] generateMatrix(int A) {
        int[][] out = new int[A][A];

        int k = 1;
        int left = 0;
        int right = A - 1;
        int top = 0;
        int buttom = A - 1;

        while (k <= (A * A)) {
            for (int i = left; i <= right; i++) {
                out[top][i] = k;
                k++;
            }
            top++;

            for (int i = top; i <= buttom; i++) {
                out[i][right] = k;
                k++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                out[buttom][i] = k;
                k++;
            }
            buttom--;

            for (int i = buttom; i >= top; i--) {
                out[i][left] = k;
                k++;
            }
            left++;
        }

        return out;
    }
}
