package com.eomcs.lang;

public class TagService {

  //add Tag, list Tag
  static final int TLENGTH = 100;
  static int tagSize = 0;
  static int [] genreTag = new int[TLENGTH];
  static String [] feelingTag = new String[TLENGTH];
  static String [] moodTag = new String[TLENGTH];
  static String [] placeTag = new String[TLENGTH];
  static String [] timeTag = new String[TLENGTH];
  static String [] tempoTag = new String[TLENGTH];
  static int [] weatherTag = new int[TLENGTH];
  static String [] userGenre = new String[TLENGTH];
  static String [] userWeather = new String[TLENGTH];

  static void addTag() {
    System.out.println("플레이리스트에 태그를 추가해 친구들과 공유하고");
    System.out.println("당신에게 추천하는 플레이리스트를 만나보세요.");
    System.out.println();
    System.out.print("장르 태그 : ");
    genreTag[tagSize] = Prompt.inputInt("1. #발라드\n 2. #POP\n 3. #가요\n 4. #EDM\n 5. #힙합\n 6. #트로트\n"
        + "7. #JAZZ\n 8. #CLASSIC\n 9. #ROCK\n ... 999. 직접입력\n>");

    if(genreTag[tagSize]==999) {
      userGenre[tagSize]=Prompt.inputString("#");
      tagSize++;
    }

    System.out.println("기분 태그 : ");
    feelingTag[tagSize] =Prompt.inputString("#");

    System.out.println("분위기 태그 : ");
    moodTag[tagSize] = Prompt.inputString("#");

    System.out.println("장소 태그 : ");
    placeTag[tagSize] = Prompt.inputString("#");

    System.out.println("시간 태그 : ");
    timeTag[tagSize] = Prompt.inputString("#");

    System.out.println("속도 태그 : ");
    tempoTag[tagSize] = Prompt.inputString("#");

    System.out.println("날씨 태그 : ");
    weatherTag[tagSize] = Prompt.inputInt("1. #맑은 \n 2. #쌀쌀한\n 3. #흐린\n"
        + "4. #따뜻한\n 5. #비오는\n ... 999. 직접입력\n>");

    if(genreTag[tagSize]==999) {
      userWeather[tagSize]=Prompt.inputString("#");
      tagSize++;
    }

    tagSize++;
  }

  static void listTag() {
    System.out.println("%S님의 플레이리스트의 ");

  }

}
