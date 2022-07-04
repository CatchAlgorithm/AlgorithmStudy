package DataStructure.week1.hojoon7807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Boj11866_hojoon7807 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String readLine = br.readLine();
    String[] strings = readLine.split(" ");

    List<Integer> list = new LinkedList<>();

    int n = Integer.parseInt(strings[0]);
    int k = Integer.parseInt(strings[1]);

    for (int i = 1; i <= n ; i++) {
      list.add(i);
    }

    StringBuilder sb = new StringBuilder("<");

    int index = 0;

    while (n>1) {
      index = (index + (k - 1)) % n;
      sb.append(list.remove(index)).append(", ");
      n--;
    }
    sb.append(list.remove(0)).append(">");
    System.out.println(sb);
  }

}
