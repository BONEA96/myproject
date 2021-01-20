package com.eomcs.lang;

public class PlaylistService {

  //add Playlist, list Playlist
  static int playlistSize = 0;
  static final int PLENGTH = 100;
  static String [] songs = {
      "Future - Life is Good(Feat. Dreak)" ,"Roddy Ricch - The Box","AJR - BANG!","Samm Henshaw - All Good","So!YoON! X Phum Viphurit - Wings",
      "Yerin Beak - Hate you", "Lil Nas X - Old Town Road(Feat. Billy Ray Cyrus)", "24kGoldn - Mood(Feat.Iann dior)", "Dua Lipa - Hallucinate"};
  static int [] songsNum = new int[PLENGTH];

  static void addPlaylist() {
    System.out.println("나만의 취향이 들어간 플레이리스트를 만들어 볼까요?");
    String response = Prompt.inputString("내 보관함 바로가기(Y/n)");
    if(response.equalsIgnoreCase("y")) {
      for(int i=0; i<songs.length; i++) {
        System.out.printf("%d. %s\n",i+1,songs[i]);
      }
      while(true) {
        songsNum[playlistSize] = Prompt.inputInt("노래 번호 : ");
        System.out.printf("%d번 %s\n 노래가 추가 되었습니다.",songsNum[playlistSize],songs[songsNum[playlistSize]-1]);
        String response2 = Prompt.inputString("계속(y/N)");
        playlistSize++;

        if(response2.equalsIgnoreCase("n")) {
          break;
        }
      }
    }
    System.out.println("종료");
    System.out.println();
  }

  static void listPlaylist() {
    System.out.println("플레이리스트 목록 : ");
    for(int i =0; i<playlistSize; i++) {
      System.out.println(songs[i]);

    }
  }


}
