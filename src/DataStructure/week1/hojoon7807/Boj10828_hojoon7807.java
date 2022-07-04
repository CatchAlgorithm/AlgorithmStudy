package DataStructure.week1.hojoon7807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10828_hojoon7807 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {

      String[] strings = br.readLine().split(" ");


      switch (strings[0]) {
        case "push":
          stack.push(Integer.parseInt(strings[1]));
          break;

        case "top":
          if (stack.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(stack.peek()).append("\n");
          break;

        case "size":
          sb.append(stack.size()).append("\n");
          break;

        case "empty":
          if (stack.isEmpty())
            sb.append(1).append("\n");
          else
            sb.append(0).append("\n");
          break;

        case "pop":
          if (stack.isEmpty())
            sb.append(-1).append("\n");
          else
            sb.append(stack.pop()).append("\n");
          break;
      }

    }
    System.out.println(sb);
  }
}
