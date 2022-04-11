
import java.io.*;
import java.util.*;

class GFG
{
	// function to print
	// the bracket number
	static void printBracketNumber(String exp,int n)
	{
		int left_bnum = 1;
		
	
		Stack<Integer> right_bnum =
				new Stack<Integer>();
		
		// traverse the given
		// expression 'exp'
		for (int i = 0; i < n; i++)
		{
			
			if (exp.charAt(i) == '(')
			{
				
				System.out.print(
					left_bnum + " ");
				
				
				right_bnum.push(left_bnum);
				
				
				left_bnum++;
			}
			
			else if(exp.charAt(i) == ')')
			{
				System.out.print(
					right_bnum.peek() + " ");
				right_bnum.pop();
			}
		}
	}
	
	// Driver Code
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);        
		String exp = sc.nextLine();
		int n = exp.length();
		
		printBracketNumber(exp, n);
	}
}

