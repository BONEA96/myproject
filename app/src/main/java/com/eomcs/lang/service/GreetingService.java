package com.eomcs.lang.service;
import com.eomcs.util.Prompt;

public class GreetingService {
  static String name = null;

  static void Name() {
    name = Prompt.inputString("닉네임을 정해주세요. : ");
  }

  static void Hello() {
    System.out.printf("%S님 반가워요!\n",name);
  }

}
