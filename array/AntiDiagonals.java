/* Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9

Input Format
Only argument is a 2D array A of size N * N.

Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.


Example Input
Input 1:
1 2 3
4 5 6
7 8 9
Input 2:
1 2
3 4


Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:
1 0
2 3
4 0


Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].

For input 2:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0]. */

package array;

import java.util.ArrayList;

public class AntiDiagonals {
    public int[][] diagonal(int[][] A) {
        int N = A.length;

        int out[][] = new int[2 * N - 1][N];
        ArrayList<ArrayList<Integer>> finalRes = new ArrayList<>();
        for (int j = 0; j < N; j++) {
            ArrayList<Integer> res = allplyDiagonal(0, j, N, A);
            finalRes.add(res);
        }

        for (int j = 1; j < N; j++) {
            ArrayList<Integer> res = allplyDiagonal(j, N - 1, N, A);
            finalRes.add(res);
        }

        // System.out.println(finalRes);

        for (int i = 0; i < finalRes.size(); i++) {
            for (int j = 0; j < finalRes.get(i).size(); j++) {
                out[i][j] = finalRes.get(i).get(j);
            }
        }

        return out;
    }

    public ArrayList<Integer> allplyDiagonal(int i, int j, int N, int[][] A) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        while (i < N && j >= 0) {
            res.add(A[i][j]);
            i++;
            j--;
        }

        if (res.size() < A[0].length) {
            for (int k = 0; k < N - res.size(); k++) {
                res.add(0);
            }
        }

        return res;
    }

}
