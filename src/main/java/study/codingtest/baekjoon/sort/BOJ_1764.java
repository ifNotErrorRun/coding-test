package study.codingtest.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class BOJ_1764 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    Map<String, Integer> map = new TreeMap<>();
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    for (int i = 0; i < n + m; i++) {
      String name = br.readLine();
      map.put(name, map.getOrDefault(name, 0) + 1);
    }
    List<String> nameList = map.entrySet().stream()
        .filter(entry -> entry.getValue() == 2)
        .map(Entry::getKey)
        .collect(Collectors.toList());
    System.out.println(nameList.size());
    nameList.forEach(System.out::println);
  }
}
