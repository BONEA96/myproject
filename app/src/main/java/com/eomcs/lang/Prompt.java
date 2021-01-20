package com.eomcs.lang;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {

  static Scanner keyboardScanner = new Scanner(System.in);

  static String inputString(String title) {
    System.out.println(title);
    return keyboardScanner.nextLine();

  }

  static int inputInt(String title) {
    System.out.println(title);
    return Integer.parseInt(inputString(title));
  }

  static Date inputDate(String title) {
    System.out.println(title);
    return Date.valueOf(inputString(title));
  }

  static void close() {
    keyboardScanner.close();
  }

}
