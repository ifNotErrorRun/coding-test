package study.codingtest.baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1271 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    BigInteger n1 = new BigInteger(st.nextToken());
    BigInteger n2 = new BigInteger(st.nextToken());
    System.out.println(n1.divide(n2));
    System.out.println(n1.mod(n2));
  }
}
