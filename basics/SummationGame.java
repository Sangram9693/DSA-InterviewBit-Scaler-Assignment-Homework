/* Problem Description
Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user

Problem Constraints
1 <= N <= 1000

Input Format
A single line representing N
Output Format
A single integer showing sum of all Natural numbers from 1 to N

Example Input
Input 1:
5
Input 2:
10

Example Output
Output 1:
15

Output 2:
55 */

package basics;

import java.util.*;

public class SummationGame {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int sum = (N * (N + 1)) / 2;
        System.out.println(sum);
    }
}
