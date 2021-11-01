package com.lxg.leetCode.toplikedquestions.zcy;

import java.util.Stack;

public class Problem_0020_ValidParentheses {

	public static boolean isValid(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		char[] str = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length; i++) {
			char cha = str[i];
			if (cha == '(' || cha == '[' || cha == '{') {
				stack.add(cha);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char last = stack.pop();
				if ((cha == ')' && last != '(') || (cha == ']' && last != '[') || (cha == '}' && last != '{')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}