/*
Problem
You are given a table with N rows and M columns. Each cell is colored with white or black. Considering the shapes created by black cells, what is the maximum border of these shapes? Border of a shape means the maximum number of consecutive black cells in any row or column without any white cell in between.

A shape is a set of connected cells. Two cells are connected if they share an edge. Note that no shape has a hole in it.

Input format

- The first line contains T denoting the number of test cases.
- The first line of each test case contains integers N, M denoting the number of rows and columns of the matrix. Here, '#' represents a black cell and '.' represents a white cell. 
- Each of the next N lines contains M integers.

*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner s = new Scanner(System.in);                 
         int testcase = s.nextInt(); 
         for (int inc = 0; inc<testcase; inc++ ){
                int row=s.nextInt();             
                int column=s.nextInt();             
                s.nextLine();             
                int count=0,prev=0;             
                for(int i=0;i<row;i++){                 
                    String str=s.nextLine();                                   
                    for(int j=0;j<column;j++){                     
                        if(str.charAt(j)=='#'){                         
                            count++;                     
                            }                 
                            }                 
                            if(count>prev) prev=count;
                                               count=0;             
                                               }             
                                               System.out.println(prev);        
                                                }  

    }
}
