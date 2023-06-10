<!--- 
Problem
You have been given a positive integer N. You need to find and print the Factorial of this number. The Factorial of a positive integer N refers to the product of all number in the range from 1 to N. You can read more about the factorial of a number here.

Input Format:
The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.

Output Format
Output a single line denoting the factorial of the number N.

Constraints
--->
//SOLUTION
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner s =new Scanner(System.in);
        int number = s.nextInt();
        int count = 1;
        for (int i = 1; i <= number; i++) {
				count = count * i;
        }
        System.out.println(count);
    }
}
