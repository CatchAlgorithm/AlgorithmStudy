package Greedy.week3.kimkyunghyunn;

import java.io.*;
import java.util.*;

public class S4_2217 {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];
		
		for(int i = 0; i<N; i++) {		
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		//w = min( 병렬 연결된 로프의 중량 ) * 병렬 연결된 로프의 수
		
		long max = 0;
		for(int i = N-1; i>=0; i--) {
			int newW = arr[i] * (N-i);
			if(max < newW) max = arr[i];
		}
		System.out.println(max);
	}
}
