package String.week2.kimkyunghyunn;

import java.util.*;
import java.io.*;

public class Boj9012_KimKyungHyunn {

	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			Stack<Character> stack = new Stack<>();
			String arr = br.readLine();
			
			for(int j = 0; j<arr.length(); j++) {
				if(arr.charAt(j) == '(') {
					stack.push('(');
				}else{
					if(!stack.isEmpty()) {
						stack.pop();
					}else {
						stack.add(')');
						break;
					}
				}
			}

			if(stack.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}	
	}
}
