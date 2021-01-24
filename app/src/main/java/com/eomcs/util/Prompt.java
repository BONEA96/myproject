package com.eomcs.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {

  static Scanner keyboardScanner = new Scanner(System.in);

  public static String inputString(String title) {
    System.out.println(title);
    return keyboardScanner.nextLine();

  }

  public static int inputInt(String title) {
    System.out.println(title);
    return Integer.parseInt(inputString(title));
  }

  public static Date inputDate(String title) {
    System.out.println(title);
    return Date.valueOf(inputString(title));
  }

  public static void close() {
    keyboardScanner.close();
  }

}
