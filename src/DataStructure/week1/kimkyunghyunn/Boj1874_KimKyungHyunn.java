package DataStructure.week1.kimkyunghyunn;

import java.util.*;
import java.io.*;

public class Boj1874_KimKyungHyunn {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr.add(Integer.parseInt(st.nextToken()));			
		}
		
		Stack<Integer> stack = new Stack<>();
		ArrayList<String> ans = new ArrayList<>();
		
		int index = 0;
		
		for(int i = 1; i <n+1; i++) {
			stack.push(i);
			ans.add("+");
			
			while(!stack.isEmpty() && stack.peek() == arr.get(index)) {
				stack.pop();
				ans.add("-");
				++index; 
			}
		}
		
		if(!stack.isEmpty()) {
			System.out.println("NO");
		}else {
			for(String s : ans) {
				System.out.println(s);
			}
		}
	}
}
