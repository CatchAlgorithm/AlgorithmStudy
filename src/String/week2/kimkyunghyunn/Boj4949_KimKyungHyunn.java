package String.week2.kimkyunghyunn;

import java.util.*;
import java.io.*;

public class Boj4949_KimKyungHyunn {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while(true) {
			String sentence = br.readLine();
			
			if(sentence.equals(".")) break;
			String st[] = sentence.split("");
			Stack<String> stack = new Stack<>(); 
			
			for(String s : st) {
				if(s.equals("(") || s.equals("[")) {
					stack.push(s);
				}else if(s.equals(")") || s.equals("]")) {
					if(!stack.isEmpty()) {
						if(s.equals(")") && stack.peek().equals("(")) {
							stack.pop();
						}else if(s.equals("]") && stack.peek().equals("[")){
							stack.pop();
						}else {
							stack.push(s);
							break;
						}
					}else {
						stack.push(s);
						break;
					}
				}			
			}
			
			if(stack.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}
