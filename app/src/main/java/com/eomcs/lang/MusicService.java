package com.eomcs.lang;

import java.sql.Date;

public class MusicService {

  //add Music, list Music
  static final int LENGTH = 100;
  static String [] musicTitle = new String[LENGTH];
  static String [] artistName = new String[LENGTH];
  static String [] albumName = new String[LENGTH];
  static String [] genre = new String[LENGTH];
  static Date [] releaseDate = new Date[LENGTH];
  static Date [] nowDate = new Date[LENGTH];
  static int musicSize = 0;
  static int number = 0;

  static void addMusic() {
    System.out.println("찾는 노래에 대한 검색어를 입력하세요.");

    musicTitle[musicSize] = Prompt.inputString("노래 제목: ");
    artistName[musicSize] = Prompt.inputString("아티스트 이름: ");
    albumName[musicSize] = Prompt.inputString("앨범 이름:");
    genre[musicSize] = Prompt.inputString("장르: ");
    releaseDate[musicSize] = Prompt.inputDate("발매일(yyyy-MM-dd): ");
    nowDate[musicSize]= new java.sql.Date(System.currentTimeMillis());
    musicSize++;
  }

  static void listMusic() {
    System.out.println("최근 검색 목록 : ");
    for(int i =0; i<musicSize; i++) {
      System.out.printf("검색 번호 : %d 검색일 : %s\n",i+1,nowDate[i]);
      System.out.printf("노래 제목 : %s 아티스트 이름 : %s 앨범 이름 : %s  장르 : %s  발매일 : %s\n",musicTitle[i], artistName[i],albumName[i], genre[i], releaseDate[i]);

    }
  }

}
