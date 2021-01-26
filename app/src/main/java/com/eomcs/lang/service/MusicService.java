package com.eomcs.lang.service;

import java.sql.Date;
import com.eomcs.lang.domain.Music;
import com.eomcs.util.Prompt;

public class MusicService {
	


  //add Music, list Music
  static final int LENGTH = 100;
  static int size = 0;
  static Music [] music = new Music[LENGTH];
  static String[] musicResult = new String[LENGTH];
  
  public void search() {
    System.out.println("찾는 노래에 대한 검색어를 입력하세요.");
    Music m = new Music();

    m.musicTitle = Prompt.inputString("노래 제목: ");
    m.artistName = Prompt.inputString("아티스트 이름: ");
    m.albumName = Prompt.inputString("앨범 이름:");
    m.genre = Prompt.inputString("장르: ");
    m.releaseDate = Prompt.inputDate("발매일(yyyy-MM-dd): ");
    m.nowDate= new Date(System.currentTimeMillis());
    
    this.music[this.size++] = m;
    
    String respons = Prompt.inputString("찾은 노래를 내 보관함에 담을까요?(Y/n)");
    if(respons.equalsIgnoreCase("y")) {
//    	String[] result = new String[LENGTH];
//		result = add(m.musicTitle, m.artistName);
//		
//		System.out.println(result);
    	musicResult[size] = new StringBuffer().append(m.musicTitle).append(" - ").append(m.artistName).toString();
    	System.out.printf("%s를 내 보관함에 담았습니다.\n",musicResult[size]);
		
    }
  }

  public void list() {
    System.out.println("최근 검색 목록 : ");
    for(int i =0; i<this.size; i++) {
    	Music m = music[i];
      System.out.printf("%d. %s - %s \n",i+1,m.musicTitle, m.artistName);
      System.out.printf("검색일 : %s\n",m.nowDate);
      System.out.printf("앨범 이름 : %s  장르 : %s  발매일 : %s\n", m.albumName, m.genre, m.releaseDate);
      //System.out.print(musicResult);
    }
  }
  
//   static String[] add(String musicTitle, String artistName) {
//	  
//	  String[] addMusic = new String [LENGTH];
//	  for (int i=0; i<LENGTH; i++){
//		 // Music m = music[size];
//		  addMusic[i] += (musicTitle+"-"+artistName);
//		 // addMusic[i] += artistName;
//	  }
//	 return addMusic;
//  }

}
