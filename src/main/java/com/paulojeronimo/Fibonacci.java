package com.paulojeronimo;

public class Fibonacci {
  public static long calculate(long n) {
    return n <= 1 ? n : calculate(n-1) + calculate(n-2);
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args.length > 0 ? args[0] : "5");
    System.out.println(String.format("Fibonacci(%s) = %s", n, calculate(n)));
  }
}
