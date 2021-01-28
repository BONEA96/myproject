package com.eomcs.lang.service;
import com.eomcs.util.Prompt;

public class TagService {
	static class Tag {
		 // int title;
		  int genreTag;
		  String feelingTag;
		  String moodTag ;
		  String placeTag;
		  String timeTag;
		  String tempoTag;
		  String weatherTag;
		  String userGenre;
	}

  //add Tag, list Tag
  static final int LENGTH = 100;
  static int size = 0;
  static Tag[] tag = new Tag[LENGTH];

  


  public static void add() {
    System.out.println("플레이리스트에 태그를 추가해 친구들과 공유하고");
    System.out.println("당신에게 추천하는 플레이리스트를 만나보세요.");
    System.out.println();
    
    Tag t = new Tag();
    //System.out.println("태그를 추가할 플레이리스트를 선택해주세요.: ");
   // t.title = Prompt.inputInt("1.흐린날 듣기 좋은 플레이리스트\n 2.\n>");
    System.out.println("장르 태그 : ");
    t.genreTag = Prompt.inputInt("1. #발라드\n 2. #POP\n 3. #가요\n 4. #EDM\n 5. #힙합\n 6. #트로트\n"
        + "7. #JAZZ\n 8. #CLASSIC\n 9. #ROCK\n ... 99. 직접입력\n>");

    if( t.genreTag==99) {
    	 t.userGenre=Prompt.inputString("#");
      tag[size++] = t;
    }

    System.out.println("기분 태그 : ");
    t.feelingTag =Prompt.inputString("#");

    System.out.println("분위기 태그 : ");
    t.moodTag = Prompt.inputString("#");

    System.out.println("장소 태그 : ");
    t.placeTag = Prompt.inputString("#");

    System.out.println("시간 태그 : ");
    t.timeTag = Prompt.inputString("#");

    System.out.println("속도 태그 : ");
    t.tempoTag = Prompt.inputString("#");

    System.out.println("날씨 태그 : ");
    t.weatherTag = Prompt.inputString("#");


    tag[size++] = t;
  }

  public static void list() {
    System.out.println("%S님의 플레이리스트 : ");
    for (int i=0; i<size; i++) {
    	Tag t = tag[i];
    	String tagState = null;
    	switch(t.genreTag) {
    	case 1:
    		tagState = "발라드";
    		break;
    	case 2:
    		tagState = "POP";
    		break;
    	case 3:
    		tagState = "가요";
    		break;
    	case 4:
    		tagState = "EDM";
    		break;
    	case 5:
    		tagState = "힙합";
    		break;
    	case 6:
    		tagState = "트로트";
    		break;
    	case 7:
    		tagState = "JAZZ";
    		break;
    	case 8:
    		tagState = "CLASSIC";
    		break;
    	case 9:
    		tagState = "ROCK";
    		break;
    	default:
    		tagState = t.userGenre;
    		
    	}
        System.out.printf("#%s #%s #%s #%s #%s #%s\n",tagState,t.feelingTag,t.moodTag,t.placeTag,t.timeTag,t.weatherTag);
    	
    }


  }
  
  
  

}
