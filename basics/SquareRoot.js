/* Problem Description
Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Problem Constraints
1 <= A <= 108

Input Format
First and the only argument is an integer A.
Output Format
Return an integer which is the square root of A if A is perfect square otherwise return -1.

Example Input
Input 1:
A = 4
Input 2:
A = 1001

Example Output
Output 1:
2
Output 2:
-1

Example Explanation
Explanation 1:
sqrt(4) = 2
Explanation 2:
1001 is not a perfect square. */

module.exports = { 
    //param A : integer
    //return an integer
    solve : function(A){
        if(A === 1) {
            return 1;
        }
        for(let i=1; i<A; i++) {
            if(i*i === A) {
                return i;
            }
        }
        return -1;
    }
};
