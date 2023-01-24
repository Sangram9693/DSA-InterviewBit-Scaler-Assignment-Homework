/* Problem Description
Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.
See example for clarifications over the pattern.

Problem Constraints
1 <= N <= 1000

Input Format
First line is an integer N

Output Format
N lines conatining only char '*' as per the question.

Example Input
Input 1:
4
Input 2:
6


Example Outpu
Output 1:
********
***  ***
**    **
*      *
*      *
**    **
***  ***
********
Output 2:
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************

 */
package array;

public class StarPatternI {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = i; j < N; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            for (int j = i; j < N - 1; j++) {
                System.out.print(" ");
            }

            for (int j = i; j < N - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
