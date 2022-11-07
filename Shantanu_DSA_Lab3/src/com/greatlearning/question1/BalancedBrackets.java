package com.greatlearning.question1;

import java.util.*;

public class BalancedBrackets {

	// function to check whether brackets are balanced
	static boolean BracketsBalanced(String expression)
	{
		Stack<Character> stack = new Stack<Character>();
		  
       for (int i = 0; i < expression.length(); i++) {
			char x = expression.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		return (stack.isEmpty());
	}

	
	public static void main(String[] args)
	{
		String expression = "([{}])";

		if (BracketsBalanced(expression))
			System.out.println("The entered string has Balanced Brackets ");
		else
			System.out.println("The entered string does not have Balanced Brackets ");
	}
}
